import java.util.Scanner;

/**
 * Created by Arnas on 2017.02.25.
 */
public class Reader {
    private Scanner reader = new Scanner(System.in);

    public Reader(){

    }

    public String readString(){
        return reader.nextLine();
    }

    public int readInteger(){
        return Integer.parseInt(reader.nextLine());
    }
}
