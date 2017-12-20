package reader.criteria;

/**
 * Created by Arnas on 2017.03.25.
 */
public class LengthAtLeast implements Criterion {
    private int length;

    public LengthAtLeast(int length){
        this.length = length;
    }

    @Override
    public boolean complies(String line) {
        if(line.length() >= this.length){
            return true;
        }
        else {
            return false;
        }
    }
}
