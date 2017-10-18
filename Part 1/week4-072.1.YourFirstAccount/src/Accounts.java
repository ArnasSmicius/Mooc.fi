
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account arnosAccount = new Account("Arno's account", 100.00);

        arnosAccount.deposit(20.00);
        System.out.println(arnosAccount);
    }

}
