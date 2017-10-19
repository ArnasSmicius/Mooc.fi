/**
 * Created by Arnas on 2017.02.12.
 */
public class Product {
    private String name;
    private Double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
