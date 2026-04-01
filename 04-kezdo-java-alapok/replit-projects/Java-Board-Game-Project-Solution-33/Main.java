public class Main {

    public static void main(String[] args) {
        Hero myHero = new Hero(0, 0);
        Monster monster = new Monster(Monster.BASE_MONSTER_HEALTH, Monster.BASE_MONSTER_ATTACK, new Position(0, 2), 'M');

        System.out.println("Hero's attack power: " + myHero.attack());
        System.out.println("Monster's attack power: " + monster.attack());
    }

}