
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int lenght = reader.nextInt();
        System.out.println("Result: " + substring(word, lenght));
    }

    public static String substring (String word, int lenght){
        String result = word.substring(0, lenght);
        return result;
    }
}
