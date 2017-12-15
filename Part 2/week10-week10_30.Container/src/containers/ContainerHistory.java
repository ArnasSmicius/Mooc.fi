package containers;

import java.util.ArrayList;

/**
 * Created by Arnas on 2017.03.05.
 */
public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory(){
        this.history = new ArrayList<>();
    }

    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        else {
            Double maxValue = Double.MIN_VALUE;
            for (Double value : this.history){
                if(value > maxValue){
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }

    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        else {
            Double minValue = Double.MAX_VALUE;
            for (Double value : this.history) {
                if (value < minValue) {
                    minValue = value;
                }
            }
            return minValue;
        }
    }

    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        else {
            Double average = 0.0;
            for (Double value : this.history){
                average += value;
            }
            return average / this.history.size();
        }
    }

    public double greatestFluctuation(){
        if (this.history.size() <= 1){
            return 0;
        }
        Double result = Double.MIN_VALUE;
        for (int i = 0; i < this.history.size() - 1 ; i++){
            if (result < (Math.abs(this.history.get(i) - this.history.get(i+1)))){
                result = Math.abs(this.history.get(i) - this.history.get(i+1));
            }
        }
        return result;
    }

    public double variance(){
        if (this.history.size() <= 1){
            return 0;
        }
        else {
            Double result = 0.0;
            for (Double value : this.history) {
                result += Math.pow(value - average(), 2);
            }
            result = result / (this.history.size() - 1);
            return result;
        }
    }

    public void add(double situation){
        this.history.add(situation);
    }

    public void reset(){
        this.history = new ArrayList<>();
    }

    public String toString(){
        return this.history.toString();
    }
}
