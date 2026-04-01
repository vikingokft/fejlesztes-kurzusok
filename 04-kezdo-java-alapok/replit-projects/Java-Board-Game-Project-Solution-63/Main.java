import board.Board;
import java.util.Scanner;

public class Main {

    private static final char[][] BOARD = {
        { 'M', 'M', 'P', 'P', 'M', 'P', 'M', 'P', 'P', 'B' },
        { 'P', 'M', 'P', 'M', 'M', 'P', 'P', 'M', 'P', 'B' },
        { 'M', 'P', 'P', 'M', 'M', 'M', 'P', 'P', 'P', 'B' }
    };
    private static final boolean IS_FIELD_TYPE_VISIBLE = true;

    public static void main(String[] args) {
        GameSetup gameSetup = new GameSetup(BOARD, IS_FIELD_TYPE_VISIBLE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number here between 1 and 3:");
        int step = scanner.nextInt();
        System.out.println("The hero is moving forward " + step + " steps");
    }

}