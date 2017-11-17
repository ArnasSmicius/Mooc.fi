
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array){
        int smallestDigit = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array[i] < smallestDigit){
                smallestDigit = array[i];
            }
        }
        return smallestDigit;
    }

    public static int indexOfTheSmallest (int[] array){
        int smallestNumberIndex = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (smallest(array) == array[i]){
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestNumber = Integer.MAX_VALUE;
        int numberIndex = 0;
        for (int i =  0 ; i < array.length ; i++){
            if (i >= index){
                if (array[i] < smallestNumber){
                    smallestNumber = array[i];
                    numberIndex = i;
                }
            }
        }
        return numberIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int helpVariable = array[index1];
        array[index1] = array[index2];
        array[index2] = helpVariable;
    }

    public static void sort(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i) );
        }
    }

}
