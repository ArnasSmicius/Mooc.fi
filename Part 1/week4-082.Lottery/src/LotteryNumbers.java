import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;


    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i < 7){
            while (true){
                int randomNumber = 1 + random.nextInt(39);
                if (!containsNumber(randomNumber)){
                    this.numbers.add(randomNumber);
                    break;
                }
            }
            i++;
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){
            return true;
        }
        else {
            return false;
        }

    }
}
