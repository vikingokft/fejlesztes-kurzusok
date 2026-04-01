public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    public int calculateArea() {
        return this.getWidth() * this.getHeight();
    }

}