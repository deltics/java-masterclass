package nz.co.deltics.udemy.javamasterclass.section5.ex27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextLine()){
                if (scan.hasNextInt()) {
                    int num = scan.nextInt();
                    sum += num;
                    count++;
                    scan.nextLine();
                } else {
                    break;
                }
            }
        }
        scan.close();

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / count));
    }
}
