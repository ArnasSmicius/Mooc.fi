
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        System.out.println();
        for (Student std : list) {
            System.out.println(std);
        }

        System.out.println();
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for (Student person : list) {
            if (person.getName().contains(searchTerm)) {
                System.out.println(person);
            }
        }
        // write here the main program
    }
}