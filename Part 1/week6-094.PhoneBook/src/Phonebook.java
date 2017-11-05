import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.19.
 */
public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : list) {
            if (person.getName().contains(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
