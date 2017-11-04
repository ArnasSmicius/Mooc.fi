import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.19.
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team (String name){
        this.name = name;
        this.maxSize = 16;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void printPlayers(){
        for (Player person : players){
            System.out.println(person);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        if (players.size() > this.maxSize) {
            return this.maxSize;
        }
        else {
            return players.size();
        }
    }
    public int goals(){
        int result = 0;
        for (Player player : players){
            result += player.goals();
        }
        return result;
    }
}
