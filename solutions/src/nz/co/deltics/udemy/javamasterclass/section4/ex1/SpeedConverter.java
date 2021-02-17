package nz.co.deltics.udemy.javamasterclass.section4.ex1;

public class SpeedConverter {

    private static final double MilesToKms = 1.609d;

    public static void printConversion(double kph) {
        long mph = toMilesPerHour(kph);

        String s = (mph != -1) ? kph + " km/h = " + mph + " mi/h" : "Invalid Value";
        System.out.println(s);
    }


    public static long toMilesPerHour(double kph) {
        if (kph < 0)
            return -1;

        return Math.round(kph / MilesToKms);
    }
}

