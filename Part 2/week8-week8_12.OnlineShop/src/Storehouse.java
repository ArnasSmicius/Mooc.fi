import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Arnas on 2017.02.28.
 */
public class Storehouse {
    private Map<String, Integer> productInfo;
    private Map<String, Integer> storage;

    public Storehouse(){
        this.productInfo = new HashMap<>();
        this.storage = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productInfo.put(product, price);
        this.storage.put(product, stock);
    }

    public int price(String product){
        if (this.productInfo.get(product) == null){
            return -99;
        }
        else {
            return this.productInfo.get(product);
        }
    }
    public int stock(String product){
        if (storage.get(product) == null){
            return 0;
        }
        return this.storage.get(product);
    }

    public boolean take(String product){
        if (storage.get(product) == null){
            return false;
        }
        if (storage.get(product) == 0){
            return false;
        }
        else {
            int newValue = storage.get(product) - 1;
            storage.replace(product, newValue);
            return true;
        }
    }

    public Set<String> products(){
        Set<String> products = this.productInfo.keySet();
        return products;
    }
}
