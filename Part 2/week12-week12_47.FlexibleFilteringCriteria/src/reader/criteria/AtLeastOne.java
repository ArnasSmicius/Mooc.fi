package reader.criteria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.25.
 */
public class AtLeastOne implements Criterion {
    private List<Criterion> criterions;

    public AtLeastOne(Criterion... criterions){
        this.criterions = new ArrayList<Criterion>();
        for(int i = 0 ; i < criterions.length ; i++){
            this.criterions.add(criterions[i]);
        }
    }

    @Override
    public boolean complies(String line) {
        for(Criterion criterion : this.criterions){
            if(criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
}
