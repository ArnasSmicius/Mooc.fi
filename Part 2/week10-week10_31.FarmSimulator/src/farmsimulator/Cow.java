package farmsimulator;

/**
 * Created by Arnas on 2017.03.06.
 */
public class Cow implements Alive, Milkable {
    private String name;
    private Double udderCapacity;
    private double amountOfMilk;

    public Cow(){
        this.name = NAMES[(int)(Math.random() * NAMES.length)];
        this.udderCapacity = Math.random() * 25 + 15;
    }

    public Cow(String name){
        this.name = name;
        this.udderCapacity = Math.random() * 25 + 15;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.udderCapacity;
    }

    public double getAmount(){
        return this.amountOfMilk;
    }

    @Override
    public String toString(){
        return getName() + " " + Math.ceil(getAmount()) + "/" + Math.ceil(getCapacity());
    }

    @Override
    public void liveHour() {
        double value = Math.random() * 1.3 + 0.7;
        if (getAmount() + value > getCapacity()){
            this.amountOfMilk = getCapacity();
        }
        else {
            this.amountOfMilk += value;
        }
    }

    @Override
    public double milk() {
        double milkToReturn = getAmount();
        this.amountOfMilk = 0.00;
        return milkToReturn;
    }

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
}
