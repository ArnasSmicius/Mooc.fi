import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.02.
 */
public class TextUserInterface {
    Scanner reader;
    private Participants jumpers;

    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.jumpers = new Participants();
    }

    public void start(){
        addingJumpers();
        startTournament();
        quit();
    }

    public void addingJumpers(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String statement;
            statement = reader.nextLine();
            if (statement.equals("")){
                break;
            }
            else {
                jumpers.addJumper(statement);
            }
        }
    }

    public void startTournament(){
        System.out.println();
        System.out.println("The tournament begins!");
        while(true) {
            System.out.println();
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String statement = reader.nextLine();
            System.out.println();
            if (!statement.equals("jump")){
                break;
            }
            this.jumpers.jump();
        }
    }

    public void quit(){
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        jumpers.printResults();
    }
}
