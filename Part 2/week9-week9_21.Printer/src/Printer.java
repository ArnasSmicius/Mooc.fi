import java.io.File;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String fileName) {
        file = new File(fileName);
        reader = null;
    }

    public void printLinesWhichContain(String word) throws Exception{
        reader = new Scanner(this.file);
        while(reader.hasNext()){
            String line = reader.nextLine();
            if (word.equals("")){
                System.out.println(line);
            }
            else {
                if (line.contains(word)){
                    System.out.println(line);
                }
            }
        }
    }
}
