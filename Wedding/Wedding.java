import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        
        Map<String, String> res = new HashMap<>();
        List<String>  firstList = new ArrayList<>(first) ; 
        List<String>  secondList = new ArrayList<>(second) ;

        while (firstList.size() != 0 && secondList.size() != 0) {
            Random r = new Random();
            int firstCouple = r.nextInt(firstList.size());
            int secondCouple = r.nextInt(secondList.size());

            res.put(firstList.get(firstCouple), secondList.get(secondCouple));
            firstList.remove(firstCouple);
            secondList.remove(secondCouple);
        }

        return res;
    }
}