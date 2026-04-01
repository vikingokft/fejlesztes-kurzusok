public abstract class GameCharacter {

    private double healthPoint;
    private double attackPoint;
    private char initial;

    public GameCharacter(double healthPoint, double attackPoint, char initial) {
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
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

    public char getInitial() {
        return initial;
    }

    public void printGameCharacter() {
        System.out.println(initial + " = { a: " + attackPoint + ", h: " + (healthPoint < 0 ? 0 : healthPoint) + " }");
    }

}