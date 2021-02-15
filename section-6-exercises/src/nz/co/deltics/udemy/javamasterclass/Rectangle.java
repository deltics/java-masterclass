package nz.co.deltics.udemy.javamasterclass;

public class Rectangle {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length >= 0 ? length : 0;
        this.width = width >= 0 ? width : 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
