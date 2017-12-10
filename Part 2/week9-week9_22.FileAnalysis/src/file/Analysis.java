package file;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Analysis {
    private File file;

    public Analysis(File file){
        this.file = file;
    }

    public int lines() throws Exception {
        Scanner reader = new Scanner(this.file);
        int lineCounter = 0;
        while(reader.hasNext()){
            reader.nextLine();
            lineCounter++;
        }
        return lineCounter;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int charCounter = 0;
        while (reader.hasNext()){
            String line = reader.nextLine();
            charCounter += line.length();
            charCounter++;
        }
        return charCounter;
    }
}
