import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.25.
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Container(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int weight = 0;
        for (Suitcase suitcase : suitcases){
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
}
