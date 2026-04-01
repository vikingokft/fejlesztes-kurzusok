public class Position {

    private int level;
    private int field;

    public Position(int level, int field) {
        this.level = level;
        this.field = field;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public String positionString() {
        return "[" + level + ", " + field + "]";
    }

}