import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GUI program = new GUI();

        GUI.startTheProgram();
        while(true){
            int score = readScore(scanner);
            if (score == -1){
                break;
            }
            if (score >= 0 && score <= 60){
                program.addGrade(score);
            }
        }
    program.printResults();

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

    public static int readScore(Scanner scanner){
        return scanner.nextInt();
    }
}
