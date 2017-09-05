
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberOne, numberTwo, result;

        System.out.print("Type a number: ");
        numberOne = reader.nextInt();
        System.out.print("Type another number: ");
        numberTwo = reader.nextInt();
        result = Math.max(numberOne, numberTwo);
        System.out.print("\nThe bigger number of the two numbers given was: " + result);
        reader.close();

        // Implement your program here. Remember to ask the input from user
    }
}
