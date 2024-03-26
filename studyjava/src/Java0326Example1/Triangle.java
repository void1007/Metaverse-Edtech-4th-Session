package Java0326Example1;

public class Triangle implements Shape{
    private double length;
    private double width;

    public Triangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width / 2;
    }

    @Override
    public double calculatePerimeter() {
        return width+width+width;
    }
}
