package board;

public class Board {

    private Level[] levels;
    private int currentLevel;

    public Board(char[][] boardSetup) {
        currentLevel = 0;
        levels = createBoardFromSetup(boardSetup);
    }

    private Level[] createBoardFromSetup(char[][] boardSetup) {
        Level[] newLevels = new Level[boardSetup.length];
        for (int i = 0; i < boardSetup.length; i++) {
            newLevels[i] = new Level(boardSetup[i]);
        }
        return newLevels;
    }

    public Level[] getLevels() {
        return levels;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void printBoard(boolean isFieldTypeVisible) {
        for (int i = 0; i < levels.length; i++) {
            levels[i].printLevel(i, null, isFieldTypeVisible);
        }
    }

}