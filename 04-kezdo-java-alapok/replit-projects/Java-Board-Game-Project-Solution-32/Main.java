public class Main {

    public static void main(String[] args) {
        Hero myHero = new Hero(0, 0);
        Monster monster = new Monster(Monster.BASE_MONSTER_HEALTH, Monster.BASE_MONSTER_ATTACK, new Position(0, 2), 'M');

        myHero.printGameCharacter();
        myHero.step(1);
        myHero.printGameCharacter();
        monster.printGameCharacter();

        System.out.println(TestDiceRolls.getDiceRoll());
        System.out.println(TestDiceRolls.getDiceRoll());
        TestDiceRolls.counter = 0;
        System.out.println(TestDiceRolls.getDiceRoll());
    }

}