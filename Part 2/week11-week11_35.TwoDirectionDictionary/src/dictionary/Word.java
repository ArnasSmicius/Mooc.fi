package dictionary;

/**
 * Created by Arnas on 2017.03.11.
 */
public class Word {
    private String word;
    private String translation;

    public Word(String word, String translation){
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return this.word;
    }

    public String getTranslation() {
        return this.translation;
    }
}
