import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arnas on 2017.02.28.
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket(){
        this.basket = new HashMap<>();
    }

    public void add(String product, int price){
        if (basket.keySet().contains(product)){
            basket.get(product).increaseAmount();
        }
        else {
            basket.put(product, new Purchase(product, price));
        }
    }

    public int price(){
        int totalPrice = 0;
        for (Purchase purchase : basket.values()){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print(){
        for (Purchase purchase : basket.values()){
            System.out.println(purchase);
        }
    }
}
