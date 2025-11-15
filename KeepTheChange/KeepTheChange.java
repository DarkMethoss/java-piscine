import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> listCoins = new ArrayList<>(coins.stream().toList());
        Collections.sort(listCoins, Collections.reverseOrder());

        List<Integer> change = new ArrayList<>();

        while (amount > 0) {

            for (Integer coin : listCoins) {
                Integer deff = amount - coin;
                if (deff >= 0) {
                    change.add(coin);
                    amount -= coin;
                }
            }
        }

        Collections.sort(change, Collections.reverseOrder());
        return change;
    }
}