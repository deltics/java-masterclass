package nz.co.deltics.udemy.javamasterclass;

public class NumberPalindrome {

    public static boolean isPalindrome(int num) {

        String s = String.valueOf(Math.abs(num));

        for(int i = 0; i <= s.length() / 2; i++) {
            int ii = (s.length() - i) - 1;

            if (s.charAt(i) != s.charAt(ii))
                return false;
        }

        return true;
    }

}
