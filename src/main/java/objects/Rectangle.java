package objects;

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * width) + (2 * length);
    }

    public double calculateArea() {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }
}
