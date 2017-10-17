import java.util.ArrayList;

public class Variance {
    public static double sum(ArrayList<Integer> list) {
        double result = 0;
        for (int digit : list){
            result += digit;
        }
        return result;
    }

    public static double average(ArrayList<Integer> list) {
        double result = (double)sum(list) / list.size();
        return result;
    }

    public static double variance(ArrayList<Integer> list) {
        ArrayList<Double> values = new ArrayList<Double>();
        double average = average(list);
        for (int digit : list){
            values.add(Math.pow(digit - average, 2));
        }
        double sumList = 0;
        for (double digit : values){
            sumList += digit;
        }
        double result;
        result = sumList / (values.size()-1);
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
