
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessNumber, guessCount = 0;

        while (true){
            System.out.print("Guess a number: ");
            guessNumber = reader.nextInt();
            guessCount++;
            if (guessNumber == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if (guessNumber < numberDrawn){
                System.out.print("The number is greater, ");
                System.out.println("guesses made: " + guessCount);
            }
            else{
                System.out.print("The number is lesser, ");
                System.out.println("guesses made: " + guessCount);
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
