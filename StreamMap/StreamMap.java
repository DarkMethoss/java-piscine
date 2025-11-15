import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Set;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.mapToInt(a -> a.length()).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(a -> a.toUpperCase()).toList();
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(nb -> nb  > 42).map(Double::intValue).collect(Collectors.toSet());
    }
}