import java.util.Scanner;

/**
 * Created by Arnas on 2017.02.26.
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        while(true){
            System.out.println();
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")){
                break;
            }
            else if (command.equals("add")){
                add();
            }
            else if (command.equals("translate")){
                translate();
            }
            else {
                System.out.println("Unknown statement");
            }
        }
        System.out.println("Cheers!");
    }

    private void add(){
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(word, translation);
    }

    private void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}
