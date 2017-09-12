
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String inPassword;

        while (true) {
            System.out.print("Type the password: ");
            inPassword = reader.nextLine();
            if (inPassword.equals(password))
            {
                System.out.print("Right!");
                break;
            }
            System.out.print("Wrong!");
        }
        System.out.print("\nThe secret is: jryy qbar!");
    }
}
