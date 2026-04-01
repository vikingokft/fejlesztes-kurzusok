public class Shape {

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printShape() {
        System.out.println("width: " + this.width + ", height: " + this.height);
    }

    public int calculateArea() {
        return 0;
    }

}