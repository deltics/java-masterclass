package nz.co.deltics.udemy.javamasterclass.section5.ex16;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int num) {

        if (num < 0)
            return -1;

        String s = String.valueOf(num);
        int first = Integer.parseInt(s.substring(0, 1));
        int last = Integer.parseInt(s.substring(s.length() - 1));

        return first + last;
    }

}
