import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
           if (list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);

        Collections.sort(newList);
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);
            
        Collections.sort(newList, Collections.reverseOrder());
        return newList;
    }
}