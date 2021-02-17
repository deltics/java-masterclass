package nz.co.deltics.udemy.javamasterclass.section8.ex41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int count) {
        int[] result = new int[count];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            result[i] = scanner.nextInt();
        }

        return result;
    }

    public static int[] sortIntegers(int[] array) {

        int[] sorted = Arrays.stream(array).sorted().toArray();

        for (int i = 0; i < sorted.length / 2; i++) {
            int t = sorted[i];
            sorted[i] = sorted[sorted.length - i - 1];
            sorted[sorted.length - i - 1] = t;
        }

        return sorted;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}
