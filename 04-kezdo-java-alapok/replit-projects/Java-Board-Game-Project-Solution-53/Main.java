import board.Board;
import character.MonsterArmy;
import character.GameCharacter;

public class Main {

    private static final char[][] BOARD = {
        { 'M', 'M', 'P', 'P', 'M', 'P', 'M', 'P', 'P', 'B' },
        { 'P', 'M', 'P', 'M', 'M', 'P', 'P', 'M', 'P', 'B' },
        { 'M', 'P', 'P', 'M', 'M', 'M', 'P', 'P', 'P', 'B' }
    };
    private static final boolean IS_FIELD_TYPE_VISIBLE = true;

    public static void main(String[] args) {
        Board board = new Board(BOARD);
        MonsterArmy monsterArmy = new MonsterArmy(board);
        System.out.println(monsterArmy.getArmy().size());
        GameCharacter monster = monsterArmy.getMonster(0, 0);
        System.out.println(monsterArmy.getArmy().size());
    }

}