
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 1, sum = 0;

        System.out.println("Until what? ");
        int limit = reader.nextInt();
        while(i <= limit)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
