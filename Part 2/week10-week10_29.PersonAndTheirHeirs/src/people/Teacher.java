package people;

/**
 * Created by Arnas on 2017.03.05.
 */
public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\n  salary " + this.salary + " euros/month";
    }
}
