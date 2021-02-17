package nz.co.deltics.udemy.javamasterclass.section5.ex20;

public class GreatestCommonDivisor {

        public static int getGreatestCommonDivisor(int a, int b) {

            if ((a < 10) || (b < 10))
                return -1;

            int d = (a > b) ? a / 2 : b / 2;

            while ((d > a) || (d > b) || (a % d != 0) || (b % d != 0)) {
                d--;
            }

            return d;
        }

}
