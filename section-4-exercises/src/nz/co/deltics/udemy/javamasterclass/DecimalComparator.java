package nz.co.deltics.udemy.javamasterclass;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        int ia = (int)(a * 1000);
        int ib = (int)(b * 1000);

        return ia == ib;
    }

}
