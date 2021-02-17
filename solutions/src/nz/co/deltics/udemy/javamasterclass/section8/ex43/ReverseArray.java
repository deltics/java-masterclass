package nz.co.deltics.udemy.javamasterclass.section8.ex43;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
