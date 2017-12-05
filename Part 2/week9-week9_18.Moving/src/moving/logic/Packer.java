package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<>();
        Box box = new Box(this.boxesVolume);
        for (Thing thing : things){
            if(thing.getVolume() + box.getVolume() <= this.boxesVolume){
                box.addThing(thing);
            }
            else {
                boxes.add(box);
                box = new Box(this.boxesVolume);
                if (thing.getVolume() < this.boxesVolume){
                    box.addThing(thing);
                }
            }
        }
        if (box.getVolume() > 0){
            boxes.add(box);
        }
        return boxes;
    }
}
