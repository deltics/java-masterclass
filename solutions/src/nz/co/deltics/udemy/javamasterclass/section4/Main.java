package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
        System.out.println(FeetAndInches.calcFeetAndInchesToCentimeters(1, 0));
        System.out.println(FeetAndInches.calcFeetAndInchesToCentimeters(1, 6));
        System.out.println(FeetAndInches.calcFeetAndInchesToCentimeters(12));
        System.out.println(FeetAndInches.calcFeetAndInchesToCentimeters(18));
        System.out.println(FeetAndInches.calcFeetAndInchesToCentimeters(1));

        System.out.println(MinutesAndSeconds.getDurationString(65, 45));
        System.out.println(MinutesAndSeconds.getDurationString(3945));
        System.out.println(MinutesAndSeconds.getDurationString(-1));
    }
}
