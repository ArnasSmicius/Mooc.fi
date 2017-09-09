
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int grade;

        System.out.print("Type the points [0-60]: ");
        grade = reader.nextInt();
        if (grade < 30)
        {
            System.out.print("\nGrade: failed");
        }
        else if (grade < 35)
        {
            System.out.print("\nGrade: 1");
        }
        else if (grade < 40)
        {
            System.out.print("\nGrade: 2");
        }
        else if (grade < 45)
        {
            System.out.print("\nGrade: 3");
        }
        else if (grade < 50)
        {
            System.out.print("\nGrade: 4");
        }
        else
        {
            System.out.print("\nGrade: 5");
        }

    }
}
