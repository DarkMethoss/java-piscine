import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        Map<Character, List<String>> res;
        res = s.collect(Collectors.toMap(
                str -> str.toUpperCase().charAt(0),
                str -> new ArrayList<String>(List.of(str)),
                (oldList, newList) -> {
                    (oldList).addAll(newList);
                    return oldList;
                }));
        return res;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        Map<Integer, Optional<Integer>> res;
        res = s.collect(Collectors.toMap(
                nb -> nb % 4,
                nb -> Optional.of(nb),
                StreamCollect::getMax
        ));
        return res;
    }

    private static Optional<Integer> getMax(Optional<Integer> opt1, Optional<Integer> opt2) {
        if (!opt1.isPresent() && !opt2.isPresent()) {
            return Optional.empty();
        } else if (opt1.isPresent() && !opt2.isPresent()) {
            return opt1;
        } else if (!opt1.isPresent() && opt2.isPresent()) {
            return opt2;
        } else {
            return Optional.of(Math.max(opt1.get(), opt2.get()));
        }
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        return s.collect(Collectors.joining(" # ", "##{", "}"));
    }
}