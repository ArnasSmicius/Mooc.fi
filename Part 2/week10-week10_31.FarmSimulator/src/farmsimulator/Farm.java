package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.07.
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public String getOwner(){
        return this.owner;
    }

    public void addCow(Cow cow){
        this.cows.add(cow);
    }

    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }

    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour(){
        for (Cow cow : this.cows){
            cow.liveHour();
        }
    }

    @Override
    public String toString(){
        String result = "";
        result += "Farm owner: " + getOwner() + "\n";
        result += "Barn bulk tank: " + Math.ceil(this.barn.getBulkTank().getVolume()) + "/" + Math.ceil(this.barn.getBulkTank().getCapacity()) + "\n";
        result += "Animals:" + "\n";
        for (Cow cow : this.cows){
            result += "        " + cow + "\n";
        }
        return result;
    }
}
