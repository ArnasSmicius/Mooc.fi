package farmsimulator;

/**
 * Created by Arnas on 2017.03.06.
 */
public class MilkingRobot {
    private BulkTank connectedTank;

    public MilkingRobot(){
    }

    public BulkTank getBulkTank(){
        return this.connectedTank;
    }

    public void setBulkTank(BulkTank tank){
        this.connectedTank = tank;
    }

    public void milk(Milkable milkable){
        if (this.connectedTank == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        else {
            this.connectedTank.addToTank(milkable.milk());
        }
    }
}
