import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        return list.lastIndexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i< list.size(); i++){
            Integer nb = list.get(i);
            if (nb.equals(value) ){
                res.add(i);
            }
        }
        if (res.isEmpty()) {
            return null;
        }else {
            return res;
        }
    }
}