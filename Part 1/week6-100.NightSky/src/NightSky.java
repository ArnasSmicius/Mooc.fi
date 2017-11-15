import java.util.Random;

/**
 * Created by Arnas on 2017.02.21.
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int stars = 0;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0 ; i < this.width; i++){
            double percentage = random.nextDouble() * 100;
            if (percentage > this.density * 100){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
                this.stars++;
            }
        }
        System.out.println();
    }
    public void print(){
        this.stars = 0;
        for (int i = 0 ; i < this.height ; i++){
            printLine();
        }
    }

    public int starsInLastPrint(){
        return this.stars;
    }
}
