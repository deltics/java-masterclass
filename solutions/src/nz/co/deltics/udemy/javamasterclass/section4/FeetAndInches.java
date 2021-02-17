package nz.co.deltics.udemy.javamasterclass;

public class FeetAndInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12))
            return -1.0;

        return 2.54 * ((feet * 12) + inches);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1.0;

        double feet = inches / 12;
        inches -= (feet * 12);

        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
