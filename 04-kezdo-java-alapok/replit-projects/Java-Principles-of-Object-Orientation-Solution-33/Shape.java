public class Shape {

    private int width;
    private int height;
    public static String color = "red";
    public static int numberOfShapes = 0;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
        numberOfShapes++;
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

    public static double convertSizeToMeter(int sizeInCentiMeter) {
        return sizeInCentiMeter / 100;
    }

    public static double convertSizeToMilliMeter(int sizeInCentiMeter) {
        return sizeInCentiMeter * 10;
    }

}