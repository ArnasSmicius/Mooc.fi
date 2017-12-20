package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Arnas on 2017.03.25.
 */
public class Employees {
    private ArrayList<Person> employees;

    public Employees(){
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person){
        this.employees.add(person);
    }

    public void add(List<Person> persons){
        for(Person person : persons){
            this.employees.add(person);
        }
    }

    public void print(){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                System.out.println(person);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
