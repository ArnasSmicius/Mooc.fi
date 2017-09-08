import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.print("Type the first number: ");
        numberOne = reader.nextInt();
        System.out.print("Type the second number: ");
        numberTwo = reader.nextInt();
        if (numberOne == numberTwo)
        {
            System.out.print("\nThe numbers are equal!");
        }
        else if (numberOne > numberTwo)
        {
            System.out.print("\nGreater number: " + numberOne);
        }
        else
        {
            System.out.print("\nGreater number: " + numberTwo);
        }
    }
}
