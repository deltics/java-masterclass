package nz.co.deltics.udemy.javamasterclass.section5.ex21;

public class FactorPrinter {

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        String result = "1";

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                result += " " + i;
        }
        if (num > 1)
            result += " " + num;

        System.out.println(result);
    }
}
