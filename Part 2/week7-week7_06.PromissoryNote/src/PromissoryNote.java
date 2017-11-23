import java.util.HashMap;

/**
 * Created by Arnas on 2017.02.26.
 */
public class PromissoryNote {
    private HashMap<String, Double> promissoryNotes;

    public PromissoryNote(){
        this.promissoryNotes = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        promissoryNotes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        if (this.promissoryNotes.containsKey(whose)){
            return this.promissoryNotes.get(whose);
        }
        return 0;
    }
}
