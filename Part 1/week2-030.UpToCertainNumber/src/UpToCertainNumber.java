
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number? ");
        int limit = reader.nextInt();
        for(int number = 1; number <= limit; number++)
        {
            System.out.println(number);
        }
        
    }
}
