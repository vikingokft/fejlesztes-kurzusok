package character;

import java.util.Random;

public class Hero extends GameCharacter {

    private static final char HERO_INITIAL = 'H';
    private static final double BASE_HEALTH = 100.0;
    private static final double INSTANT_KILL = 1000.0;
    private static final double HARD_ATTACK = 10.0;
    private static final double MEDIUM_ATTACK = HARD_ATTACK * (60.0 / 100.0);
    private static final double WEAK_ATTACK = HARD_ATTACK * (30.0 / 100.0);

    public Hero(int level, int field) {
        super(BASE_HEALTH, HARD_ATTACK, new Position(level, field), HERO_INITIAL);
    }

    public void step(int field) {
        this.getPosition().setField(field);
    }

    public void changeLevel(int level) {
        this.getPosition().setLevel(level);
    }

    @Override
    public double attack() {
        Random random = new Random();
        int diceRoll = random.nextInt(8) + 1;
        System.out.println(HERO_INITIAL + " rolled a(n) " + diceRoll);

        double attackPower;
        if (diceRoll <= 2) {
            attackPower = INSTANT_KILL;
        } else if (diceRoll <= 4) {
            attackPower = HARD_ATTACK;
        } else if (diceRoll <= 6) {
            attackPower = MEDIUM_ATTACK;
        } else {
            attackPower = WEAK_ATTACK;
        }

        return attackPower;
    }

}