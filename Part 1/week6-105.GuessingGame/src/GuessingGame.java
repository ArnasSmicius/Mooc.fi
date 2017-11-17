import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        while (lowerLimit != upperLimit) {
            boolean condition = isGreaterThan(average(lowerLimit, upperLimit));
            if (condition) {
                lowerLimit = average(lowerLimit, upperLimit) + 1;
                condition = answer(condition, lowerLimit, upperLimit);
                if (condition = false){
                    break;
                }
            }
            else {
                upperLimit = average(lowerLimit, upperLimit);
                condition = answer(condition, lowerLimit, upperLimit);
                if (condition = false){
                    break;
                }
            }
        }
    }
        //System.out.println("The number you're thinking of is " + upperLimit + ".");
        private static boolean answer(boolean condition, int lowerLimit, int upperLimit){
            if (lowerLimit == upperLimit){
                if (condition){
                    System.out.println("The number you're thinking of is " + upperLimit + ".");
                    return false;
                }
                else {
                    System.out.println("The number you're thinking of is " + lowerLimit + ".");
                    return false;
                }
            }
        return true;


        // write the guessing logic here

        }


    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        if (this.reader.nextLine().toLowerCase().trim().equals("y")){
            return true;
        }
        else {
            return false;
        }
    }

    public int average(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber) / 2;
    }
}
