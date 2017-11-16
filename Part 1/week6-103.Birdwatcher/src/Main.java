public class Main {  

    public static void main(String[] args) {
        Procedures procedure = new Procedures();

        boolean condition = true;
        while (condition) {
            procedure.menu();
            condition = procedure.condition();
        }
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
