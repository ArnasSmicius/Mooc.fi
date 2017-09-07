
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int age;

        System.out.print("How old are you? ");
        age = reader.nextInt();
        if (age >= 18)
        {
            System.out.print("\nYou have reached the age of majority!");
        }
        else
        {
            System.out.print("\nYou have not reached the age of majority yet!");
        }
    }
}
