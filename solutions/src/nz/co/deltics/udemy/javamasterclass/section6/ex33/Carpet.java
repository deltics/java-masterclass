package nz.co.deltics.udemy.javamasterclass.section6.ex33;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost >= 0 ? cost : 0;
    }

    public double getCost() {
        return cost;
    }
}
