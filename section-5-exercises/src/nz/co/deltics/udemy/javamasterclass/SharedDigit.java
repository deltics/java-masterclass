package nz.co.deltics.udemy.javamasterclass;

import java.util.HashSet;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10) || (a > 99) || (b < 10) || (b > 99))
            return false;

        String s = String.valueOf(a) + String.valueOf(b);

        HashSet<Character> digits = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++)
            digits.add(s.charAt(i));

        return digits.toArray().length < 4;
    }

}
