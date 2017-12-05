package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<>();
    }

    public boolean addThing(Thing thing){
        if (thing.getVolume() + this.getVolume() > this.maximumCapacity){
            return false;
        }
        else {
            box.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int result = 0;
        for (Thing thing : box){
            result += thing.getVolume();
        }
        return result;
    }
}
