
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of characters: " + calculateCharacters(reader.nextLine()));
    }
    
    public static int calculateCharacters(String text){
        return text.length();
    }
    
}
