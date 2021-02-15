package nz.co.deltics.udemy.javamasterclass;

public class LargestPrime {

    public static int getLargestPrime(int num) {

        if (num < 2)
            return -1;

        for (int f = num; f > 0; f--) {

            if (num % f != 0)
                continue;

            boolean isPrime = true;
            for(int p = f / 2; p > 1; p--) {
                if (f % p == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                return f;
        }

        return -1;
    }
}
