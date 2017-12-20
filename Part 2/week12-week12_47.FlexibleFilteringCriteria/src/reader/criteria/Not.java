package reader.criteria;

/**
 * Created by Arnas on 2017.03.25.
 */
public class Not implements Criterion {
    private Criterion criterion;

    public Not(Criterion criterion){
        this.criterion = criterion;
    }

    @Override
    public boolean complies(String line) {
        if(!criterion.complies(line)){
            return true;
        }
        else {
            return false;
        }
    }
}
