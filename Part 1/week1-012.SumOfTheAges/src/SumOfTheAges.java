
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String nameOne, nameTwo;
        int ageOne, ageTwo, result;

        System.out.print("Type your name: ");
        nameOne = reader.next();
        System.out.print("Type your age: ");
        ageOne = reader.nextInt();
        System.out.print("\nType your name: ");
        nameTwo = reader.next();
        System.out.print("Type your age: ");
        ageTwo = reader.nextInt();
        reader.close();
        result = ageOne + ageTwo;
        System.out.print("\n" + nameOne + " and " + nameTwo + " are " + result + " years old in total.");


        // Implement your program here
    }
}
