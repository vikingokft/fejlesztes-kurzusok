import board.Board;
import board.FieldType;
import character.Hero;
import character.MonsterArmy;
import java.util.Scanner;

public class GameLogic {

    private static final double BASE_POTION_VALUE = 30.0;
    private static final double POTION_DECREASE = 5.0;

    private int currentLevel;
    private int currentField;
    private boolean isFieldTypeVisible;

    public GameLogic(boolean isFieldTypeVisible) {
        this.isFieldTypeVisible = isFieldTypeVisible;
    }

    public void run(Board board, Hero hero) {
        System.out.println("START");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean heroIsAlive = true;

        while (heroIsAlive) {
            System.out.print("Choose step: 1 2 3\n");
            int step = scanner.nextInt();

            while (step < 1 || step > 3) {
                System.out.println("Please choose from the following steps: 1, 2, 3");
                step = scanner.nextInt();
            }

            moveHero(board, hero, step);
            changeLevel(board, hero);

            FieldType fieldType = board.getLevels()[currentLevel].getField(currentField).getFieldType();

            if (fieldType == FieldType.POTION) {
                pickUpPotion(hero);
            }

            hero.printGameCharacter();
            board.getLevels()[currentLevel].printLevel(currentLevel, hero.getPosition(), isFieldTypeVisible);
            System.out.println();
        }
    }

    private void moveHero(Board board, Hero hero, int step) {
        currentField = Math.min(currentField + step, board.getLevels()[currentLevel].getFields().length - 1);
        hero.step(currentField);
    }

    private void changeLevel(Board board, Hero hero) {
        if (currentField >= board.getLevels()[currentLevel].getFields().length) {
            currentLevel++;
            currentField = 0;
            board.setCurrentLevel(currentLevel);
            hero.step(currentField);
            hero.changeLevel(currentLevel);
        }
    }

    private void pickUpPotion(Hero hero) {
        double potionValue = BASE_POTION_VALUE - (currentLevel * POTION_DECREASE);
        hero.setHealthPoint(hero.getHealthPoint() + potionValue);
        System.out.println("-----POTION PICKUP-----");
    }

}