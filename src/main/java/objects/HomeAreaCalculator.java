package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double area1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        double area2 = room2.calculateArea();

        double totalArea = area1 + area2;
        System.out.println("Area of both rooms: " + totalArea);
    }
}
