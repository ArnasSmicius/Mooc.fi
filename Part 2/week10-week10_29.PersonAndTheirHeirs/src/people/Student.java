package people;

/**
 * Created by Arnas on 2017.03.05.
 */
public class Student extends Person {
    private int credits;

    public Student(String name, String address){
        super(name, address);
        this.credits = 0;
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    public String toString(){
        return super.toString() + "\n  credits " + credits();
    }
}
