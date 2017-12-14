import java.util.*;

/**
 * Created by Arnas on 2017.03.03.
 */
public class Contacts {
    private Map<String, Person> nameContacts;
    private Map<Set<String>, Person> phoneContacts;
    private Map<String, Person> addressContacts;
    private List<Person> contacts;

    public Contacts(){
        this.contacts = new ArrayList<>();
        this.addressContacts = new HashMap<>();
        this.phoneContacts = new HashMap<>();
        this.nameContacts = new HashMap<>();
    }

    public boolean containsPersonByName(String name){
        for (Person person : this.contacts){
            if (person.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    private void addContact(String name){
        if (!this.nameContacts.containsKey(name)){
            Person newPerson = new Person(name);
            this.contacts.add(newPerson);
            this.nameContacts.put(newPerson.getName(), newPerson);
        }
    }

    public void addNumber(String name, String number){
        addContact(name);
        for (Person person : contacts){
            if (person.getName().equals(name)){
                person.addNumber(number);
                this.phoneContacts.remove(person.getNumbers(), person);
                this.phoneContacts.put(person.getNumbers(), person);
            }
        }
    }

    public void searchNumberByName(String name){
        if (!this.nameContacts.containsKey(name)){
            System.out.println("  not found");
        }
        else {
            this.nameContacts.get(name).printNumbers();
        }
    }

    public String searchPersonByNumber(String number){
        for(Person person : this.contacts){
            Set<String> numbers = person.getNumbers();
            for (String testNumber : numbers){
                if (testNumber.equals(number)){
                    return " " + person.getName();
                }
            }
        }
        return " not found";
    }

    public void addAddress(String name, String address){
        addContact(name);
        for (Person person : this.contacts){
            if (person.getName().equals(name)){
                person.addAddress(address);
                this.addressContacts.put(person.getAddress(), person);
            }
        }
    }

    public void printPersonalInfo(String name){
        boolean personFound = false;
        for (Person person : this.contacts){
            if (person.getName().equals(name)){
                personFound = true;
                person.printAddress();
                if(person.getNumbers().isEmpty()){
                    System.out.println("  phone number not found");
                }
                else {
                    person.printNumbersForPersonalInfo();
                }
            }
        }
        if (!personFound){
            System.out.println("  not found");
        }
    }

    public void deletePersonalInfo(String name){
        if (this.containsPersonByName(name)) {
            Person deletedPerson = new Person("");
            for(Person person : this.contacts){
                if (person.getName().equals(name)){
                    deletedPerson = person;
                }
            }
            this.nameContacts.remove(deletedPerson.getName());
            this.phoneContacts.remove(deletedPerson.getNumbers());
            this.addressContacts.remove(deletedPerson.getAddress());
            this.contacts.remove(this.contacts.indexOf(deletedPerson));
        }
        else {
            System.out.println("  not found");
        }
    }

    public void searchByKeyword(String keyword){
        Map<String, Person> matchedContacts = new HashMap<>();
        for (Person person : this.nameContacts.values()){
            if (matchingKeyword(keyword, person.getName()) || matchingKeyword(keyword, person.getAddress())){
                matchedContacts.put(person.getName(), person);
            }
        }
        if (matchedContacts.isEmpty()){
            System.out.println(" keyword not found");
            System.out.println();
        }
        List<String> list = new ArrayList<String>(matchedContacts.keySet());
        Collections.sort(list);
        for (String name : list){
            Person person = matchedContacts.get(name);
            System.out.println();
            System.out.println(" " + person.getName());
            printPersonalInfo(person.getName());
            System.out.println();
        }
    }

    private boolean matchingKeyword(String keyword, String value){
        if (value == null){
            return false;
        }
        return value.contains(keyword);
    }
}
