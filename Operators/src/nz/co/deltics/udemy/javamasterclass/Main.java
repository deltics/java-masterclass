package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        double first = 20d;
        double second = 80d;
        double result = (first + second) * 100d;

        double remainder = result % 40;

        boolean noRemainder = (remainder == 0);

        System.out.println("noRemainder = " + noRemainder);

        if (!noRemainder)
            System.out.println("Hmmm, we got some remainder");
    }
}
