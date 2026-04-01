public class Main {

    public static void main(String[] args) {
        Hero myHero = new Hero(0, 2);
        Monster monster = new Monster(Monster.BASE_MONSTER_HEALTH, Monster.BASE_MONSTER_ATTACK, new Position(0, 2), 'M');

        myHero.fight(monster);
        monster.fight(myHero);
        myHero.fight(monster);
    }

}