package reader.criteria;

/**
 * Created by Arnas on 2017.03.25.
 */
public class Both implements Criterion {
    private Criterion criterion1;
    private Criterion criterion2;

    public Both(Criterion criterion1, Criterion criterion2){
        this.criterion1 = criterion1;
        this.criterion2 = criterion2;

    }
    @Override
    public boolean complies(String line) {
        if(criterion1.complies(line) && criterion2.complies(line)){
            return true;
        }
        else {
            return false;
        }
    }
}
