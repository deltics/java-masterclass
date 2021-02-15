package nz.co.deltics.udemy.javamasterclass;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c))
            return false;

        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        String sc = String.valueOf(c);

        char ca = sa.charAt(sa.length() - 1);
        char cb = sb.charAt(sb.length() - 1);
        char cc = sc.charAt(sc.length() - 1);

        return (ca == cb) || (cb == cc) || (ca == cc);
    }


    public static boolean isValid(int num) {
        return (num >= 10) && (num <= 1000);
    }

}
