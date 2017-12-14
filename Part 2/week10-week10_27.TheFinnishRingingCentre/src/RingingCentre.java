import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Arnas on 2017.03.05.
 */
public class RingingCentre {
    private Map<Bird, List<String>> database;

    public RingingCentre(){
        this.database = new HashMap<>();
    }

    public void observe(Bird bird, String place){
        if (this.database.containsKey(bird)){
            List<String> observationPlaces = this.database.get(bird);
            observationPlaces.add(place);
            this.database.replace(bird, observationPlaces);
        }
        else {
            List<String> observationPlace = new ArrayList<>();
            observationPlace.add(place);
            this.database.put(bird, observationPlace);
        }
    }

    public void observations(Bird bird){
        if (!this.database.containsKey(bird)){
            System.out.println(bird + " observations: 0");
        }
        else {
            System.out.println(bird + " observations: " + this.database.get(bird).size());
            for (String place : this.database.get(bird)) {
                System.out.println(place);
            }
        }
    }
}
