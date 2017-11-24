import java.util.Scanner;

/**
 * Created by Arnas on 2017.02.26.
 */
public class TextUserInterface {
    private Scanner reader;
    private Airport airport;

    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.airport = new Airport();
    }

    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }
            System.out.println();
            System.out.println("Flight service");
            System.out.println("------------");
            System.out.println();
            while(true){
                System.out.println("Choose operation:");
                System.out.println("[1] Print planes");
                System.out.println("[2] Print flights");
                System.out.println("[3] Print plane info");
                System.out.println("[x] Quit");
                System.out.print("> ");
                String command = reader.nextLine();
                if (command.equals("x")){
                    break;
                }
                else if (command.equals("1")){
                    airport.printPlanes();
                }
                else if (command.equals("2")){
                    airport.printFlights();
                }
                else if (command.equals("3")){
                    printPlane();
                }
            }
        System.out.println();
    }

    private void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = reader.nextInt();
        reader.nextLine();
        airport.addAirplane(planeID, capacity);
    }

    private void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String location = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        airport.addFlight(planeID, location, destination);
    }
    private void printPlane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        airport.printPlane(planeID);
    }
}
