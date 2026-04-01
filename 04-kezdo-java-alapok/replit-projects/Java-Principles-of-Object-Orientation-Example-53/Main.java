import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(19, 24);
        Shape square = new Rectangle(10, 10);
        Shape rhombus = new Rhombus(19, 24, 34);

        ArrayList<Shape> boxForShapes = new ArrayList<>();
        boxForShapes.add(rectangle);
        boxForShapes.add(square);
        boxForShapes.add(rhombus);
    }

}