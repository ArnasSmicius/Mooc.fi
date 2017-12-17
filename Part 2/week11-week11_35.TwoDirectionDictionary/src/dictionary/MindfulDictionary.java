package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Arnas on 2017.03.11.
 */
public class MindfulDictionary {
    private ArrayList<Word> dictionary;
    private String fileName;

    public MindfulDictionary(){
        this.dictionary = new ArrayList<>();
    }

    public MindfulDictionary(String file){
        this();
        this.fileName = file;
    }

    public void add(String word, String translation){
        this.dictionary.add(new Word(word, translation));
    }

    public boolean load(){
        try {
            Scanner reader = new Scanner(new File(this.fileName));
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        }
        catch (FileNotFoundException e){
            return false;
        }
    }

    public boolean save(){
        try{
            FileWriter writer = new FileWriter(this.fileName);
            for(Word word : this.dictionary){
                writer.write(word.getWord() + ":" + word.getTranslation() + "\n");
            }
            writer.close();
            return true;
        }
        catch (IOException e){
            return false;
        }
    }

    public void remove(String word){
        for (Word dictWord : this.dictionary){
            if(dictWord.getWord().contains(word)){
                this.dictionary.remove(dictWord);
                break;
            }
            else if(dictWord.getTranslation().contains(word)){
                this.dictionary.remove(dictWord);
                break;
            }
        }
    }

    public String translate(String word){
        for (Word dictWord : this.dictionary){
            if (dictWord.getWord().contains(word)){
                return dictWord.getTranslation();
            }
        }
        for (Word dictWord : this.dictionary){
            if (dictWord.getTranslation().contains(word)){
                return dictWord.getWord();
            }
        }
        return null;
    }
}
