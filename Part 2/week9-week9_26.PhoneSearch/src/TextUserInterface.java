import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.03.
 */
public class TextUserInterface {
    private Scanner reader;
    private Contacts contacts;

    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.contacts = new Contacts();
    }

    public void start(){
        writeCommands();
        doCommands();
    }

    public void writeCommands(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

    public void doCommands(){
        while(true) {
            System.out.println();
            System.out.print("command: ");
            String command = reader.nextLine();
            if (command.equals("x")){
                break;
            }
            if (command.equals("1")){
                addNumber();
            }
            if (command.equals("2")){
                searchNumberByName();
            }
            if (command.equals("3")){
                searchPersonByNumber();
            }
            if (command.equals("4")){
                addAddress();
            }
            if (command.equals("5")){
                searchPersonalInfo();
            }
            if (command.equals("6")){
                deletePersonalInfo();
            }
            if (command.equals("7")){
                searchByKeyword();
            }
        }
    }

    public void addNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        this.contacts.addNumber(name, number);
    }

    public void searchNumberByName(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        this.contacts.searchNumberByName(name);
    }

    public void searchPersonByNumber(){
        System.out.print("number: ");
        String number = reader.nextLine();
        System.out.println(this.contacts.searchPersonByNumber(number));
    }

    public void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        String address = street + " " + city;
        this.contacts.addAddress(name, address);
    }

    public void searchPersonalInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.contacts.printPersonalInfo(name);
    }

    public void deletePersonalInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        this.contacts.deletePersonalInfo(name);
    }

    public void searchByKeyword(){
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        this.contacts.searchByKeyword(keyword);
    }
}
