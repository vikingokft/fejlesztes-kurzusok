public class Main {

    public static void main(String[] args) {
        char[] levelSetup = { 'M', 'M', 'P', 'P', 'M', 'P', 'M', 'P', 'P', 'B' };
        Level testLevel = new Level(levelSetup);
        testLevel.printLevel(1, new Position(1, 4), true);
    }

}