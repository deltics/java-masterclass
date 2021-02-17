package nz.co.deltics.udemy.javamasterclass.section5.ex23;

public class NumberToWords {

    public static void numberToWords(int num) {

        boolean isNegative = num < 0;

        if (isNegative) {
            System.out.println("Invalid Value");
            return;
        }

        final String[] DIGITS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();
        int digitsLeft = getDigitCount(num);

        num = reverse(num);
        do {
            int r = num % 10;

            result.append(DIGITS[r]);
            if (digitsLeft > 0)
                result.append(" ");

            num = num / 10;
            digitsLeft--;
        } while (digitsLeft > 0);

        System.out.println(result.toString());
    }



    public static int reverse(int num) {

        boolean isNegative = num < 0;

        int result = 0;
        do {
            result *= 10;
            result += Math.abs(num % 10);
            num = num / 10;
        } while (num != 0);

        return (isNegative ? -1 : 1) * result;
    }


    public static int getDigitCount(int num) {

        if (num < 0)
            return -1;

        return String.valueOf(num).length();
    }
}
