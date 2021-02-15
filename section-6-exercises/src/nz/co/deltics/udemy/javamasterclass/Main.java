package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberToWords.reverse(1));
        System.out.println(NumberToWords.reverse(-1));
        System.out.println(NumberToWords.reverse(24));
        System.out.println(NumberToWords.reverse(-24));
        NumberToWords.numberToWords(-1);
        NumberToWords.numberToWords(1);
        NumberToWords.numberToWords(120);

        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(7));
        System.out.println(LargestPrime.getLargestPrime(21));

        DiagonalStar.printSquareStar(4);
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);

        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
	}
}
