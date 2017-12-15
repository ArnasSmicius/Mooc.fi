package farmsimulator;

import java.util.Collection;

/**
 * Created by Arnas on 2017.03.07.
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow){
        if (this.milkingRobot == null){
            throw new IllegalStateException("Install a milking robot!");
        }
        else {
            this.milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        if (this.milkingRobot == null){
            throw new IllegalStateException("Install a milking robot!");
        }
        else {
            for (Cow cow : cows){
                this.milkingRobot.milk(cow);
            }
        }
    }

    @Override
    public String toString(){
        return "Barn: " + Math.ceil(this.tank.getVolume()) + "/" + Math.ceil(this.tank.getCapacity());
    }
}
