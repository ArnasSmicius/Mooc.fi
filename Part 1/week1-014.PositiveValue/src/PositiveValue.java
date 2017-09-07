
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        System.out.print("Type a number: ");
        number = reader.nextInt();
        if (number > 0)
        {
            System.out.print("\nThe number is positive.");
        }
        else
        {
            System.out.print("\nThe number is not positive.");
        }
    }
}
