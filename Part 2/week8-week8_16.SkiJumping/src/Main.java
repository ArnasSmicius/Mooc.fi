import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        TextUserInterface program = new TextUserInterface(reader);
        program.start();
    }
}
