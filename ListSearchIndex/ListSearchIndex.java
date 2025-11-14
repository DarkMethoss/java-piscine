import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        int index =  list.lastIndexOf(value);
        if (index == -1) {
            return null;
        }else {
            return index;
        }
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        int index = list.indexOf(value);
        if (index == -1) {
            return null;
        }else {
            return index;
        }
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<Integer>();
        if (list == null ){
            return res;
        }
        for (int i = 0; i< list.size(); i++){
            Integer nb = list.get(i);
            if (nb.equals(value) ){
                res.add(i);
            }
        }
        
        return res;
    }
}