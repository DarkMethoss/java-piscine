import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return -1;
        }
        int index =  list.lastIndexOf(value);
        if (index == -1) {
            return null;
        }else {
            return null;
        }
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return -1;
        }
        int index = list.lastIndexOf(value);
        if (index == -1) {
            return null;
        }else {
            return null;
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