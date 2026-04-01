public class Rhombus extends Rectangle {

    private int side;

    public Rhombus(int diagonalQ, int diagonalP, int side) {
        super(diagonalQ, diagonalP);
        this.side = side;
    }

    public void printShape() {
        System.out.println("Diagonal Q: " + this.getWidth() + ", Diagonal P: " + this.getHeight() + ", side: " + this.side);
    }

    public int calculateArea() {
        return (this.getWidth() * this.getHeight()) / 2;
    }

}