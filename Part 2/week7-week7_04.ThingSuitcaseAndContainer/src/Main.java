public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        for (int i = 0 ; i < 100 ; i++){
            Suitcase suitcaseWithBrick = new Suitcase(100);
            Thing brick = new Thing("Brick", 1 + i);
            suitcaseWithBrick.addThing(brick);
            container.addSuitcase(suitcaseWithBrick);
        }
        // adding 100 suitcases with one brick in each
    }
}
