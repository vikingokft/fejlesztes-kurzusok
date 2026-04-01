package character;

import helper.TestDiceRolls;

public abstract class GameCharacter {

    private double healthPoint;
    private double attackPoint;
    private Position position;
    private char initial;

    public GameCharacter(double healthPoint, double attackPoint, Position position, char initial) {
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
        this.position = position;
        this.initial = initial;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public Position getPosition() {
        return position;
    }

    public char getInitial() {
        return initial;
    }

    public void printGameCharacter() {
        System.out.println(initial + " = { a: " + attackPoint + ", h: " + (healthPoint < 0 ? 0 : healthPoint) + ", p: " + position.positionString() + " }");
    }

    public abstract double attack();

    public void fight(GameCharacter enemy) {
        double attackPower = this.attack();
        System.out.println(this.initial + " attack: " + attackPower);
        enemy.setHealthPoint(enemy.getHealthPoint() - attackPower);
        enemy.printGameCharacter();
        if (enemy.getHealthPoint() <= 0) {
            System.out.println("-----" + enemy.getInitial() + " DEAD-----");
        }
    }

}