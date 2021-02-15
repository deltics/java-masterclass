package nz.co.deltics.udemy.javamasterclass;

public class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        final int minTemp = 25;
        final int maxTemp = isSummer ? 45 : 35;

        return (temp >= minTemp) && (temp <= maxTemp);
    }

}
