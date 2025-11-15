import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> list1 = first.size() > second.size() ?  second.stream().toList(): first.stream().toList();
        List<String> list2 =  first.size() > second.size()  ? first.stream().toList(): second.stream().toList();

        List<String>  shortList = new ArrayList<String>(list1) ;
        List<String>  longList = new ArrayList<String>(list2) ;

        // int[] =

        return shortList.stream().collect(Collectors.toMap(
            s -> s,
            s -> {
                Random r = new Random();
                int index = r.nextInt(longList.size());
                String v = longList.get(index);
                longList.remove(index);
                return v;
            }
        ));
    }
}