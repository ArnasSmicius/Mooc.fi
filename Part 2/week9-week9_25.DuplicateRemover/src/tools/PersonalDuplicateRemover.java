package tools;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Arnas on 2017.03.03.
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private int duplicateCount;
    private Set<String> uniqueStrings;

    public PersonalDuplicateRemover(){
        this.duplicateCount = 0;
        this.uniqueStrings = new HashSet<String>();
    }


    @Override
    public void add(String characterString) {
        if (!this.uniqueStrings.contains(characterString)){
            this.uniqueStrings.add(characterString);
        }
        else {
            this.duplicateCount++;
        }

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.uniqueStrings;
    }

    @Override
    public void empty() {
        this.uniqueStrings = new HashSet<>();
        this.duplicateCount = 0;
    }
}
