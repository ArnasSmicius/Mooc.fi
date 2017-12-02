import java.util.Random;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Judgers {

    public static int LENGHT(){
        return (int)(Math.random() * 60) + 60;
    }

    public static int JUDGE(){
        return (int)(Math.random() * 10) + 10;
    }
}
