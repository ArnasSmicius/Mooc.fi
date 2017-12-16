package dungeon;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.08.
 */
public class Dungeon {
    private Logic program;
    private int moves;
    private boolean vampiresMove;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.program = new Logic(length, height, vampires);
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.reader = new Scanner(System.in);
    }

    public void run(){
        boolean playerWin = false;
        while(true){
            if(this.moves == 0 && this.program.getVampires().size() > 0){
                break;
            }
            if(this.program.getVampires().size() == 0){
                playerWin = true;
                break;
            }
            System.out.println(this.moves);
            System.out.println();
            printCharCoordinations();
            printArea();
            makeMove();
            this.moves--;
        }
        if (playerWin){
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }
    }

    public void printCharCoordinations(){
        Player player = this.program.getPlayer();
        System.out.println("@ " + player.getY() + " " + player.getX());
        List<Vampire> vampires = this.program.getVampires();
        for (Vampire vampire : vampires){
            System.out.println("v " + vampire.getX() + " " + vampire.getY());
        }
        System.out.println();
    }

    public void printArea(){
        char[][] area = this.program.getArea();
        for (int i = 0 ; i < area[0].length; i++){
            for (int j = 0 ; j < area.length ; j++){
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void makeMove(){
        String commands = reader.nextLine();
        for (int i = 0 ; i < commands.length() ; i++){
            this.program.makeMove(commands.charAt(i), this.vampiresMove);
        }
    }
}
