/**
 * Created by Arnas on 2017.02.12.
 */
public class Multiplier {
    private int number;

    public Multiplier(int number){
        this.number = number;
    }
    public int multiply(int otherNumber){
        int result = this.number * otherNumber;
        return result;
    }
}
