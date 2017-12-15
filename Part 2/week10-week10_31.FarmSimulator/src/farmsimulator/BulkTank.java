package farmsimulator;

/**
 * Created by Arnas on 2017.03.06.
 */
public class BulkTank {
    private Double capacity;
    private double volume;

    public BulkTank(){
        this.capacity = 2000.00;
        this.volume = 0.00;
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0.00;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return getCapacity() - getVolume();
    }

    public void addToTank(double amount){
        if (howMuchFreeSpace() < amount){
            this.volume = getCapacity();
        }
        else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount){
        double returnMilk;
        if (getVolume() < amount){
            returnMilk = this.volume;
            this.volume = 0.00;
        }
        else {
            this.volume -= amount;
            returnMilk = amount;
        }
        return returnMilk;
    }

    @Override
    public String toString(){
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
