package nz.co.deltics.udemy.javamasterclass.section5.ex12;

public class NumberInWord {

    public static void printNumberInWord(int digit) {

        String result;
        final String[] NUMBERS = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        result = ((digit < 0) || (digit > 9)) ? "OTHER" : NUMBERS[digit];

        System.out.println(result);
    }

}
