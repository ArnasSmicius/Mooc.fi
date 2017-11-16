import java.util.Scanner;

/**
 * Created by Arnas on 2017.02.22.
 */
public class GUI {
    private int[] grades = {0, 0, 0, 0, 0, 0};

    public static void startTheProgram(){
        System.out.println("Type exam scores, -1 completes:");
    }

    public void addGrade(int grade){
        if (grade < 30)
        {
            grades[0]++;
        }
        else if (grade < 35)
        {
            grades[1]++;
        }
        else if (grade < 40)
        {
            grades[2]++;
        }
        else if (grade < 45)
        {
            grades[3]++;
        }
        else if (grade < 50)
        {
            grades[4]++;
        }
        else
        {
            grades[5]++;
        }
    }

    public void printResults(){
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0 ; i--){
            System.out.print(i + ": ");
            for (int j = 0 ; j < grades[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Acceptance percentage: " + percentage());
    }

    public double percentage(){
        int passedStudents = 0;
        for (int i = 1 ; i <= 5 ; i++){
            passedStudents += grades[i];
        }
        double result = (double)(100 * passedStudents) / (passedStudents + grades[0]);
        return result;
    }
}
