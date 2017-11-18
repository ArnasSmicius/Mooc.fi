import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.25.
 */
public class Changer {
    private ArrayList<Change> list = new ArrayList<>();

    public Changer(){

    }

    public void addChange(Change change){
        list.add(change);
    }

    public String change(String characterString){
        String result = characterString;
        for (Change change : list){
            result = change.change(result);
        }
        return result;
    }
}
