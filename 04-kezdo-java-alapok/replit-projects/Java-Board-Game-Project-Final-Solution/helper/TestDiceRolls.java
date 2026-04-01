package helper;

public class TestDiceRolls {

    public static int counter = 0;
    public static int[] diceRolls = { 8, 3, 4, 3, 5, 6, 1 };

    public static int getDiceRoll() {
        return diceRolls[counter++];
    }

}