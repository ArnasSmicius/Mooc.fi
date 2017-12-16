package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.07.
 */
public class BlackHoleBox extends Box {
    private List<Thing> things;

    public BlackHoleBox(){
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
