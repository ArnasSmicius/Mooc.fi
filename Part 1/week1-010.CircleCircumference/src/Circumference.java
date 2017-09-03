
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double radius, result;

        System.out.print("Type the radius: ");
        radius = reader.nextInt();
        result = 2 * Math.PI * radius;
        System.out.print("\nCircumference of the circle: " + result);
        reader.close();

        // Program your solution here 
    }
}
