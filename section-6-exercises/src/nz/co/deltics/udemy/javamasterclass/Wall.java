package nz.co.deltics.udemy.javamasterclass;

public class Wall {

    private double width;
    private double height;


    public Wall() {
    }


    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }


    public double getHeight() {
        return height;
    }


    public double getWidth() {
        return width;
    }


    public void setHeight(double height) {
        this.height = height >= 0 ? height : 0;
    }


    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0;
    }


    public double getArea() {
        return this.width * this.height;
    }
}
