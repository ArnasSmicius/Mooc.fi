
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {

        // Write code here
        String result = "";
        for (int number : array){
            result += number + ", ";
        }
        result = result.substring(0, result.length()-2);
        System.out.println(result);
    }
}
