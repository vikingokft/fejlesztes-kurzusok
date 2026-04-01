import board.Board;
import board.FieldType;
import character.Hero;
import character.MonsterArmy;
import character.GameCharacter;
import helper.TestDiceRolls;
import java.util.Random;
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

    public void run(Board board, Hero hero, MonsterArmy monsterArmy) {
        System.out.println("START");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int potionsFound = 0;
        int monstersKilled = 0;
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
                potionsFound++;
            } else if (fieldType == FieldType.MONSTER || fieldType == FieldType.BOSS) {
                System.out.println("-----MONSTER FIGHT-----");
                GameCharacter monster = monsterArmy.getMonster(currentLevel, currentField);
                heroIsAlive = battle(hero, monster);
                if (heroIsAlive) {
                    monstersKilled++;
                    if (fieldType == FieldType.BOSS && currentLevel >= board.getLevels().length - 1) {
                        System.out.println("YOU WON!");
                        System.out.println("TOTAL POTIONS FOUND: " + potionsFound);
                        System.out.println("TOTAL MONSTERS KILLED: " + monstersKilled);
                        return;
                    }
                }
            }

            if (heroIsAlive) {
                hero.printGameCharacter();
                board.getLevels()[currentLevel].printLevel(currentLevel, hero.getPosition(), isFieldTypeVisible);
                System.out.println();
            }
        }

        System.out.println("TOTAL POTIONS FOUND: " + potionsFound);
        System.out.println("TOTAL MONSTERS KILLED: " + monstersKilled);
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

    private boolean battle(Hero hero, GameCharacter monster) {
        Random random = new Random();
        boolean heroIsAlive = true;

        while (hero.getHealthPoint() > 0 && monster.getHealthPoint() > 0) {
            hero.fight(monster);
            if (monster.getHealthPoint() <= 0) {
                break;
            }
            monster.fight(hero);
            if (hero.getHealthPoint() <= 0) {
                heroIsAlive = false;
                break;
            }
        }

        return heroIsAlive;
    }

}