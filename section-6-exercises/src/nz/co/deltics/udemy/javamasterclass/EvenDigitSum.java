package nz.co.deltics.udemy.javamasterclass;

public class EvenDigitSum {

    public static int getEvenDigitSum(int num) {

        if (num < 0)
            return -1;

        String s = String.valueOf(num);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(s.substring(i, i + 1));
            result += (digit % 2 == 0) ? digit : 0;
        }

        return result;
    }
}
