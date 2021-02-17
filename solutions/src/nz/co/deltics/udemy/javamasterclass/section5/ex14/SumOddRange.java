package nz.co.deltics.udemy.javamasterclass.section5.ex14;

public class SumOddRange {

    public static boolean isOdd(int num) {

        if (num <= 0)
            return false;

        return num % 2 == 1;

    }


    public static int sumOdd(int start, int end) {

        if ((end < start) || (start <= 0) || (end <= 0))
            return -1;

        int result = 0;

        for(int i = start; i <= end; i++) {
            result += isOdd(i) ? i : 0;
        }

        return result;
    }

}
