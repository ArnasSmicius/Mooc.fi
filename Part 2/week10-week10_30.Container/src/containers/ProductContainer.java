package containers;

/**
 * Created by Arnas on 2017.03.05.
 */
public class ProductContainer extends Container {
    private String name;

    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.name = productName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return this.name + ": " + super.toString();
    }
}
