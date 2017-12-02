import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Participants {
    private List<Jumper> jumpers;
    private int roundCount = 1;
    private ArrayList<Integer> judgersPoints;

    public Participants(){
        jumpers = new ArrayList();
        judgersPoints = new ArrayList();
    }

    public void addJumper(String name){
        jumpers.add(new Jumper(name));
    }

    public void printJumpers(){
        int order = 1;
        for (Jumper jumper : jumpers){
            System.out.println("  " + order + ". " + jumper);
            order++;
        }
        System.out.println();
    }

    public String judgersVote(Jumper jumper){
        String result = "    judge votes: [";
        judgersPoints = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            judgersPoints.add(Judgers.JUDGE());
            result += judgersPoints.get(i) + ", ";
        }
        Collections.sort(judgersPoints);
        for (int i = 1 ; i < 4; i++){
            jumper.addPoints(judgersPoints.get(i));
        }
        result = result.substring(0, result.length()-2);
        result += "]";
        return result;
    }

    public void jump(){
        System.out.println("Round " + this.roundCount);
        System.out.println();
        System.out.println("Jumping order:");
        Collections.sort(jumpers);
        printJumpers();
        System.out.println("Results of round " + this.roundCount);
        for(Jumper jumper : jumpers){
            System.out.println("  " + jumper.getName());
            int jumpLenght = Judgers.LENGHT();
            jumper.addLenght(jumpLenght);
            jumper.addPoints(jumpLenght);
            System.out.println("    length: " + jumpLenght);
            System.out.println(judgersVote(jumper));
        }
        this.roundCount++;
    }
    public void printResults(){
        int order = 1;
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (Jumper jumper : jumpers){
            System.out.println(order + "           " + jumper);
            System.out.print("            jump lengths: ");
            jumper.printLenghts();
        }
        System.out.println();
    }
}
