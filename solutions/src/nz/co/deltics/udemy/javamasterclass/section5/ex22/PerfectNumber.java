package nz.co.deltics.udemy.javamasterclass.section5.ex22;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {

        if (num < 1)
            return false;

        int sum = 0;

        for (int d = 1; d <= num / 2; d++) {
            sum += (num % d == 0) ? d : 0;
        }

        return sum == num;
    }

}
