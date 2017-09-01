
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberOne, numberTwo;
        double result;

        System.out.print("Type a number: ");
        numberOne = reader.nextInt();
        System.out.print("Type another number: ");
        numberTwo = reader.nextInt();
        result = (double)numberOne / (double)numberTwo;
        System.out.print("\nDivision: " + numberOne + " / " + numberTwo + " = " + result);
        reader.close();
        // Implement your program here. Remember to ask the input from user.
    }
}
