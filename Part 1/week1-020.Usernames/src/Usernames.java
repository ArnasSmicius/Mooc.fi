
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String userName[] = {"alex", "emily"}, passWord[] = {"mightyducks", "cat"};
        String inUsername, inPassword;
        int i;
        boolean result = false;

        System.out.print("Type your username: ");
        inUsername = reader.nextLine();
        System.out.print("Type your password: ");
        inPassword = reader.nextLine();
        for (i = 0 ; i < 2 ; i++)
        {
            if (inUsername.equals(userName[i]) && inPassword.equals(passWord[i]))
            {
                result = true;
                break;
            }
        }
        if (result)
        {
            System.out.print("You are now logged into the system!");
        }
        else
        {
            System.out.print("Your username or password was invalid!");
        }

    }
}
