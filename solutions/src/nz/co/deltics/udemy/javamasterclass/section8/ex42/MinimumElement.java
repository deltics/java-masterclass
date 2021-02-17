package nz.co.deltics.udemy.javamasterclass.section8.ex42;

import java.util.Scanner;

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.close();

        return result;
    }

    public static int[] readElements(int count) {

        int[] result = new int[count];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            result[i] = scanner.nextInt();
        }
        scanner.close();

        return result;
    }

    public static int findMin(int[] array) {

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = Math.min(array[i], result);
        }

        return result;
    }
}
