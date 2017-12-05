package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.02.
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> measureList;

    public AverageSensor(){
        sensors = new ArrayList<>();
        measureList = new ArrayList<>();
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }

    public List<Integer> readings(){
        return this.measureList;
    }

    @Override
    public boolean isOn() {
        boolean condition = true;
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                condition = false;
            }
        }
        return condition;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors){
            sensor.on();
        }

    }

    @Override
    public void off() {
        for (Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        }
        int value = 0;
        int sensorCount = 0;
        for (Sensor sensor : sensors){
            value += sensor.measure();
            sensorCount++;
        }
        int result = (int)(value / sensorCount);
        measureList.add(result);
        return result;
    }
}
