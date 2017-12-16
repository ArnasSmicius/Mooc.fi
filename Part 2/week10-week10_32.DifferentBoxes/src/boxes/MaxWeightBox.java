package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.07.
 */
public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> listOfThings;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        listOfThings = new ArrayList<>();
    }

    public int getWeight(){
        int result = 0;
        for(Thing thing : this.listOfThings){
            result += thing.getWeight();
        }
        return result;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() + getWeight() <= this.maxWeight){
            this.listOfThings.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.listOfThings.contains(thing)){
            return true;
        }
        else {
            return false;
        }
    }
}
