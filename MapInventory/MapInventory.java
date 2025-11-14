import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        Integer price = inventory.get(productId);
        if (price == null) {
            return -1;
        } else {
            return price;
        }
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        if (inventory == null) {
            return null;
        }
        List<String> res = new ArrayList<String>();

        for (String product : inventory.keySet()) {
            Integer productPrice = inventory.get(product);
            if (productPrice.equals(price)) {
                res.add(product);
            }
        }
        return res;
    }
}