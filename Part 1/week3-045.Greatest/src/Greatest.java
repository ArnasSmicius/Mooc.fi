
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int answer;
        if (number1 > number2){
            answer = number1;
        }
        else{
            answer = number2;
        }
        if (answer > number3){
            return answer;
        }
        else{
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}