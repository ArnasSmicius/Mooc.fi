
public class Accounts {

    public static void transfer (Account accFrom, Account accTo, double amount){
        accFrom.withdrawal(amount);
        accTo.deposit(amount);

    }

    public static void main(String[] args) {
        Account A = new Account ("A's account", 100);
        Account B = new Account ("B's account", 0);
        Account C = new Account ("C's account", 0);
        transfer(A, B, 50);
        transfer(B, C, 25);

    }


}
