
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numOne, numTwo, result;

        System.out.print("Type a number: ");
        numOne = reader.nextInt();
        System.out.print("Type another number: ");
        numTwo = reader.nextInt();
        reader.close();
        result = numOne + numTwo;
        System.out.print("\nSum of the numbers: " + result);
        // Implement your program here. Remember to ask the input from user
    }
}
