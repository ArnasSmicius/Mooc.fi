/**
 * Created by Arnas on 2017.02.22.
 */
public class StringUtils {

    public static boolean included(String word, String searched){
        if (word.toLowerCase().trim().contains(searched.toLowerCase().trim())){
            return true;
        }
        else {
            return false;
        }
    }
}
