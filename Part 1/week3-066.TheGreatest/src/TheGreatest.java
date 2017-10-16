import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int greatestDigit = Integer.MIN_VALUE;
        for (int digit : list){
            if (digit > greatestDigit){
                greatestDigit = digit;
            }
        }
        return greatestDigit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}