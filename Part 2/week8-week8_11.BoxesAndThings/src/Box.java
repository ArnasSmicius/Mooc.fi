import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.28.
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void add(ToBeStored thing){
        if (weight() + thing.weight() <= this.maxWeight){
            things.add(thing);
        }
    }

    public double weight(){
        double total = 0;
        for (ToBeStored thing : things){
            total += thing.weight();
        }
        return total;
    }

    public String toString(){
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
}
