import java.util.HashMap;

/**
 * Created by Arnas on 2017.02.26.
 */
public class Airport {
    HashMap<String, Airplane> airplanes;
    HashMap<Airplane, String> flights;

    public Airport(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(String planeID, int capacity){
        Airplane newPlane = new Airplane(planeID, capacity);
        airplanes.put(planeID, newPlane);
    }
    public void addFlight(String planeID, String location, String destination){
        String flightIndex = location + "-" + destination;
        airplanes.get(planeID).addFlight(flightIndex);
    }
    public void printPlanes(){
        for (Airplane airplane : airplanes.values()){
            System.out.println(airplane);
        }
    }
    public void printFlights(){
        for (Airplane airplane : airplanes.values()){
            airplane.printFlight();
        }
    }
    public void printPlane(String planeID){
        System.out.println(airplanes.get(planeID));
    }
}
