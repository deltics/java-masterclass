package nz.co.deltics.udemy.javamasterclass.section4.ex3;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (!isBarking || (hourOfDay < 0) || (hourOfDay > 23))
            return false;

        return ((hourOfDay < 8) || (hourOfDay > 22));
    }
}
