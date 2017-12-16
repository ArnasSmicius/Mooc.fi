package boxes;

/**
 * Created by Arnas on 2017.03.07.
 */
public class OneThingBox extends Box {
    private Thing thing;

    public OneThingBox(){
        this.thing = null;
    }

    @Override
    public void add(Thing thing) {
        if(this.thing == null){
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.thing == null){
            return false;
        }
        if(this.thing.equals(thing)){
            return true;
        }
        else {
            return false;
        }
    }
}
