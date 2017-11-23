import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arnas on 2017.02.26.
 */
public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }

    public String translate(String word){
        return this.dictionary.get(word);
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> results = new ArrayList<>();
        for (String word : this.dictionary.keySet()){
            results.add(word + " = " + this.dictionary.get(word));
        }
        return results;
    }
}
