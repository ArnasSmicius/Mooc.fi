/**
 * Created by Arnas on 2017.02.28.
 */
public class Purchase {
    private String productName;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice){
        this.productName = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Purchase(String product, int unitPrice){
        this.productName = product;
        this.amount = 1;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.amount * this.unitPrice;
    }

    public void increaseAmount(){
        this.amount++;
    }

    public String toString(){
        return this.productName + ": " + this.amount;
    }
}
