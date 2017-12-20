package reader.criteria;

/**
 * Created by Arnas on 2017.03.25.
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        if(line.length() == 0){
            return false;
        }

        if(line.charAt(line.length()-1) == '!' || line.charAt(line.length()-1) == '?'){
            return true;
        }
        else {
            return false;
        }
    }
}
