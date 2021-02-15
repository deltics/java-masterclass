package nz.co.deltics.udemy.javamasterclass;

public class Cuboid extends Rectangle {

    private final double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);

        this.height = height >= 0 ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
