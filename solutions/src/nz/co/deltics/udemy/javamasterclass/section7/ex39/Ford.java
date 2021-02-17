package nz.co.deltics.udemy.javamasterclass.section7.ex39;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Ford -> startEngine()";
    }

    public String accelerate() {
        return "Ford -> accelerate()";
    }

    public String brake() {
        return "Ford -> brake()";
    }

}
