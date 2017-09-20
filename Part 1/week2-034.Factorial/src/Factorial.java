import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = reader.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++){
            sum *= i;
        }
        System.out.println("Factorial is " + sum);
    }
}
