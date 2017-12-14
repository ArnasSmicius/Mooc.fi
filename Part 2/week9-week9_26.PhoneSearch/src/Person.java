import java.util.HashSet;
import java.util.Set;

/**
 * Created by Arnas on 2017.03.03.
 */
public class Person{
    private String name;
    private Set<String> phoneNumbers;
    private String address;

    public Person(String name){
        this.name = name;
        this.phoneNumbers = new HashSet<>();
        this.address = new String();
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void addNumber(String number){
        this.phoneNumbers.add(number);
    }

    public void addAddress(String address){
        this.address = address;
    }

    public Set<String> getNumbers(){
        return phoneNumbers;
    }

    public void printNumbers(){
        for (String number : phoneNumbers){
            System.out.println(" " + number);
        }
    }

    public void printNumbersForPersonalInfo(){
        System.out.println("  phone numbers:");
        for (String number : phoneNumbers){
            System.out.println("   " + number);
        }
    }

    public void printAddress(){
        if (this.address.isEmpty()){
            System.out.println("  address unknown");
        }
        else {
            System.out.println("  address: " + this.address);
        }
    }
}
