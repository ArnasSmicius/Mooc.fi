package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Arnas on 2017.03.02.
 */
public class WordInspection {
    private File file;

    public WordInspection(File file){
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        int results = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()){
            reader.nextLine();
            results++;
        }
        return results;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> wordsWithZ = new ArrayList<>();
        Scanner reader = new Scanner(this.file);
        while(reader.hasNext()){
            String word = reader.nextLine();
            if (word.contains("z")){
                wordsWithZ.add(word);
            }
        }
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> wordsEndsL = new ArrayList<>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()){
            String word = reader.nextLine();
            if (word.charAt(word.length()-1) == 'l'){
                wordsEndsL.add(word);
            }
        }
        return wordsEndsL;
    }

    public List<String> palindromes() throws FileNotFoundException {
       List<String> polindromes = new ArrayList<>();
       Scanner reader = new Scanner(this.file);
       while (reader.hasNext()){
           String word = reader.nextLine();
           String reversedWord = "";
           for (int i = word.length() - 1 ; i >= 0 ; i--){
               reversedWord += word.charAt(i);
           }
           if (word.equals(reversedWord)){
               polindromes.add(word);
           }
       }
       return polindromes;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> allWovels = new ArrayList<>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()){
            String[] vowels = {"a", "e", "i", "o", "u", "y", "ä", "ö"};
            String word = reader.nextLine();
            boolean vowelsExist = true;
            for (int i = 0 ; i < vowels.length ; i++){
                if (!word.contains(vowels[i])) {
                    vowelsExist = false;
                }
            }
            if (vowelsExist){
                allWovels.add(word);
            }
        }
        return allWovels;
    }
}
