package nz.co.deltics.udemy.javamasterclass;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int a) {
        return (a >= 13) && (a <= 19);
    }

}
