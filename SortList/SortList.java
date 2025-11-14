import java.util.List;
import java.util.Collections;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}