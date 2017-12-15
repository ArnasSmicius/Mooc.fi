package movable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.05.
 */
public class Group implements Movable {
    private List<Movable> objects;

    public Group(){
        this.objects = new ArrayList<>();
    }

    public String toString(){
        String result = "";
        for (Movable object : objects){
            result += object + "\n";
        }
        return result;
    }

    public void addToGroup(Movable movable){
        this.objects.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable object : objects){
            object.move(dx, dy);
        }
    }
}
