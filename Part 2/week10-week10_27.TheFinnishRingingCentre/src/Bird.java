
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getLatinName(){
        return this.latinName;
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode() + this.ringingYear;
    }

    @Override
    public boolean equals(Object bird) {
        if (hashCode() == bird.hashCode()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


