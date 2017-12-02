import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private ArrayList<Integer> jumpLenghts;

    public Jumper(String name){
        this.name = name;
        this.points = 0;
        this.jumpLenghts = new ArrayList<>();
    }

    public void addPoints(int amount){
        this.points += amount;
    }

    public void addLenght(int lenght){
        this.jumpLenghts.add(lenght);
    }

    public int getPoints(){
        return this.points;
    }

    public String getName(){
        return this.name;
    }

    public void printLenghts(){
        String result = "";
        for (int i : jumpLenghts){
            result += i + " m, ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }

    public String toString(){
        return this.name + " (" + this.points + " points)";
    }

    @Override
    public int compareTo(Jumper jumper) {
        return getPoints() - jumper.points;
    }
}
