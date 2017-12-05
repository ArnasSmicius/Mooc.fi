package application;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Thermometer implements Sensor {
    private boolean condition;

    public Thermometer(){
        this.condition = false;
    }

    @Override
    public boolean isOn() {
        return this.condition;
    }

    @Override
    public void on() {
        this.condition = true;
    }

    @Override
    public void off() {
        this.condition = false;
    }

    @Override
    public int measure() {
        if (!this.condition){
            throw new IllegalStateException();
        }
        else {
            return (int)(Math.random() * 60) - 30;
        }
    }
}
