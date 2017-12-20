package reference.domain;

/**
 * Created by Arnas on 2017.03.25.
 */
public class Film {
    private String name;

    public Film(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object o){
        if(this.hashCode() == o.hashCode()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
