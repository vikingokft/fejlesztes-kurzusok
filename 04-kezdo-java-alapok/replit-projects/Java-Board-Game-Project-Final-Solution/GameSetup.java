import character.Hero;
import character.MonsterArmy;
import board.Board;

public class GameSetup {

    private Hero hero;
    private Board board;
    private MonsterArmy monsterArmy;
    private boolean isFieldTypeVisible;
    private GameLogic gameLogic;

    public GameSetup(char[][] boardSetup, boolean isFieldTypeVisible) {
        this.isFieldTypeVisible = isFieldTypeVisible;
        board = new Board(boardSetup);
        hero = new Hero(0, -1);
        monsterArmy = new MonsterArmy(board);
        gameLogic = new GameLogic(isFieldTypeVisible);
    }

    public void start() {
        System.out.println("H = Hero");
        System.out.println("M = Monster");
        System.out.println("B = Boss");
        System.out.println("P = Potion");
        System.out.println();
        board.printBoard(isFieldTypeVisible);
        if (isFieldTypeVisible) {
            monsterArmy.printMonsterArmy();
        }
        gameLogic.run(board, hero, monsterArmy);
    }

}