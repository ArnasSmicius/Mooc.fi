import java.util.HashMap;

/**
 * Created by Arnas on 2017.02.26.
 */
public class Airplane {
    private String planeID;
    private int capacity;
    private HashMap<String, String> flights;

    public Airplane(String planeID, int capacity){
        this.planeID = planeID;
        this.capacity = capacity;
        this.flights = new HashMap<>();
    }

    public String getPlaneID(){
        return this.planeID;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public String toString(){
        return this.planeID + " (" + this.capacity + " ppl)";
    }
    public void addFlight(String flight){
        flights.put(flight, flight);
    }
    public void printFlight(){
        for (String flight : flights.values()){
            System.out.println(toString() + " (" + flight + ")");
        }

    }
}
