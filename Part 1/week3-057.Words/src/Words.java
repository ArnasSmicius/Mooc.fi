import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        int i = 0;
        while (true) {
            System.out.print("Type a word: ");
            words.add(reader.nextLine());
            if (words.get(i).isEmpty()) {
                break;
            }
            i++;
        }
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
