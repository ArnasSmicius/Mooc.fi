import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TextUserInterface program = new TextUserInterface(reader);
        program.start();
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
    }
}
