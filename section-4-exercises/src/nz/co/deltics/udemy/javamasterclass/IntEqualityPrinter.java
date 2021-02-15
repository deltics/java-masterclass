package nz.co.deltics.udemy.javamasterclass;

public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c) {

        String result;

        if ((a < 0 ) || (b < 0) || (c < 0)) {
            result = "Invalid Value";
        } else if ((a == b) && (b == c)) {
            result = "All numbers are equal";
        } else if ((a != b) && (b != c) && (a != c)) {
            result = "All numbers are different";
        } else {
            result = "Neither all are equal or different";
        }

        System.out.println(result);
    }
}
