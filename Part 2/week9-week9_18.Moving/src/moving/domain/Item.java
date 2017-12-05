package moving.domain;

/**
 * Created by Arnas on 2017.03.02.
 */
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;

    public Item (String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return getName() + " (" + getVolume() + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item item) {
        return getVolume() - item.getVolume();
    }
}
