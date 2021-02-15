package nz.co.deltics.udemy.javamasterclass;

public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length >= 0 ? length : 0;
        this.width = width >= 0 ? width : 0;
    }

    public double getArea() {
        return length * width;
    }
}
