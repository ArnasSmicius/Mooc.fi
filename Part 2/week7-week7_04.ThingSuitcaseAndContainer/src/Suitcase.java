import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.25.
 */
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public String toString(){
        if (things.size() == 0){
            return "empty (" + totalWeight() + " kg)";
        }
        else if (things.size() == 1){
            return things.size() + " thing (" + totalWeight() + " kg)";
        }
        else {
            return things.size() + " things (" + totalWeight() + " kg)";
        }
    }

    public void printThings(){
        for (Thing thing : things){
            System.out.println(thing);
        }

    }

    public int totalWeight(){
        int weight = 0;
        for (Thing thing : things){
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing(){
        if (things.size() == 0){
            return null;
        }
        Thing heaviestThing = new Thing("", Integer.MIN_VALUE);
        for (Thing thing : things){
            if (thing.getWeight() > heaviestThing.getWeight()){
                heaviestThing = thing;
            }
        }
        return heaviestThing;
    }
}
