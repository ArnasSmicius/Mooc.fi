import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number, sum = 0, numCounter = 0, evenCount = 0, oddCount = 0;
        double average;

        System.out.println("Type numbers: ");
        while(true){
            number = reader.nextInt();
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += number;
            numCounter++;
            if(number % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numCounter);
        average = (double)sum / numCounter;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
