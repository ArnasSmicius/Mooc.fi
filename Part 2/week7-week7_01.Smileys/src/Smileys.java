
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        System.out.println();
        printWithSmileys("87.");
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString){
        firstLastLines(characterString);
        System.out.println();
        if (smilesOdd(characterString)){
            System.out.println(":) " + characterString + " :)");
        }
        else {
            System.out.println(":) " + characterString + "  :)");
        }
        firstLastLines(characterString);
        System.out.println();

    }

    private static void firstLastLines (String characterString){
        for (int i = 0 ; i < smileCount(characterString) ; i++) {
            System.out.print(":)");
        }
    }

    private static int smileCount(String characterString){
        int smileCount;
        if (smilesOdd(characterString)){
            smileCount = (characterString.length() + 6) / 2;
        }
        else {
            smileCount = (characterString.length() + 7) / 2;
        }
        return smileCount;
    }

    private static boolean smilesOdd (String characterString){
        if (characterString.length() % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
