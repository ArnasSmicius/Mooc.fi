import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("n reverse order: ");
        for (int i = name.length() ; i > 0 ; i--){
            System.out.print(name.charAt(i-1));
        }
    }
}
