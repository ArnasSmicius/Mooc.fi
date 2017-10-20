
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        seconds.setValue(reader.nextInt());
        System.out.print("minutes: ");
        minutes.setValue(reader.nextInt());
        System.out.print("hours: ");
        hours.setValue(reader.nextInt());
        for (int i = 0 ; i < 121 ; i++){
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
        }
    }

}