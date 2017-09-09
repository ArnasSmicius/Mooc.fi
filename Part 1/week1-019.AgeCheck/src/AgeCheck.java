
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int age;

        System.out.print("How old are you? ");
        age = reader.nextInt();
        if (age >= 0 && age <= 120)
        {
            System.out.print("\nOK");
        }
        else
        {
            System.out.print("\nImpossible!");
        }

    }
}
