package nz.co.deltics.udemy.javamasterclass;

import static java.lang.String.format;

public class MinutesAndSeconds {

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59))
            return "Invalid value";

        long hours = (minutes + (seconds / 60)) / 60;
        minutes = minutes - (hours * 60);

        return format("%02d", hours) + "h " + format("%02d", minutes) + "m " + format("%02d", seconds) + "s";
    }


    public static String getDurationString(long seconds) {

        long minutes = seconds / 60;

        return getDurationString(minutes, seconds - (minutes * 60));
    }
}
