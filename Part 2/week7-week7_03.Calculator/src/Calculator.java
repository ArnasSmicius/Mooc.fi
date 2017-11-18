/**
 * Created by Arnas on 2017.02.25.
 */
public class Calculator {
    private Reader reader = new Reader();
    private int statisticsCount = 0;

    public Calculator(){

    }

    public void start(){
        while (true){
            System.out.println("command: ");
            String command = reader.readString();
            if (command.toLowerCase().trim().equals("end")){
                break;
            }
            if (command.toLowerCase().trim().equals("sum")){
                sum();
            }
            else if (command.toLowerCase().trim().equals("difference")){
                difference();
            }
            else if (command.toLowerCase().trim().equals("product")){
                product();
            }
        }
        statistics();
    }
    private void sum(){
        int[] values = readValues();
        int result = values[0] + values[1];
        System.out.println("sum of the values " + result);
    }

    private void difference(){
        int[] values = readValues();
        int result = values[0] - values[1];
        System.out.println("difference of the values " + result);
    }

    private void product(){
        int[] values = readValues();
        int result = values[0] * values[1];
        System.out.println("product of the values " + result);
    }

    private void statistics(){
        System.out.println("Calculations done " + this.statisticsCount);
    }

    private void statisticsUp(){
        this.statisticsCount++;
    }

    private int[] readValues(){
        statisticsUp();
        int[] results = new int[2];
        System.out.print("value1: ");
        results[0] = reader.readInteger();
        System.out.print("value2: ");
        results[1] = reader.readInteger();
        return results;
    }
}
