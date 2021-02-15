package nz.co.deltics.udemy.javamasterclass;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / (24 * 60 * 365);
        long days = (minutes - (years * 24 * 60 * 365)) / (24 * 60);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

}
