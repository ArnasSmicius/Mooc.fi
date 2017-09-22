public class Printing {

    public static void printStars(int amount) {
        for(int i = 0 ; i < amount ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        for (int lines = 0; lines < sideSize ; lines++){
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        for(int lines = 0; lines < height ; lines++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for(int lines = 1 ; lines <= size ; lines++){
            printStars(lines);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
