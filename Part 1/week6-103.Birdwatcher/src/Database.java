import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.23.
 */
public class Database {
    private ArrayList<Bird> list = new ArrayList<>();

    public void add(Bird bird){
        list.add(bird);
    }
    public void observe (String birdName){
        boolean noThatBird = true;
        for (Bird bird : list){
            if (bird.getName().equals(birdName)){
                bird.observation();
                noThatBird = false;
            }
            if (noThatBird){
                System.out.println("Is not a bird!");
            }
        }
    }
    public void statistics(){
        for (Bird bird: list){
            System.out.println(bird);
        }
    }
    public void birdResults(String name){
        for (Bird bird : list){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}