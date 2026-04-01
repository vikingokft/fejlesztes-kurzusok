package character;

import java.util.Random;

public class Monster extends GameCharacter {

    public static final double BASE_MONSTER_ATTACK = 5.0;
    public static final double BASE_MONSTER_HEALTH = 10.0;
    public static final double BASE_BOSS_ATTACK = 10.0;
    public static final double BASE_BOSS_HEALTH = 20.0;

    public Monster(double healthPoint, double attackPoint, Position position, char initial) {
        super(healthPoint, attackPoint, position, initial);
    }

    public double getHardAttack() {
        return getAttackPoint();
    }

    public double getMediumAttack() {
        return getHardAttack() * (60.0 / 100.0);
    }

    public double getWeakAttack() {
        return getHardAttack() * (30.0 / 100.0);
    }

    @Override
    public double attack() {
        Random random = new Random();
        int diceRoll = random.nextInt(8) + 1;
        System.out.println(getInitial() + " rolled a(n) " + diceRoll);

        double attackPower;
        if (diceRoll <= 2) {
            attackPower = getHardAttack();
        } else if (diceRoll <= 5) {
            attackPower = getMediumAttack();
        } else {
            attackPower = getWeakAttack();
        }

        return attackPower;
    }

}