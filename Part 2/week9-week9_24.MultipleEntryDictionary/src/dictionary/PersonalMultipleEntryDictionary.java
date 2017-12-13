package dictionary;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Arnas on 2017.03.03.
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
       if (!this.dictionary.containsKey(word)){
           this.dictionary.put(word, new HashSet<String>());
       }
       Set<String> translations = this.dictionary.get(word);
       translations.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translations = this.dictionary.get(word);
        return translations;
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
