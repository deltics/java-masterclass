package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min = " + minByte);
        System.out.println("Byte Max = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Min = " + minShort);
        System.out.println("Short Max = " + maxShort);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer Min = " + minInt);
        System.out.println("Integer Max = " + maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Min = " + minLong);
        System.out.println("Long Max = " + maxLong);

        int intDivision = minInt / 2;
        byte byteDivision = (byte) (minByte / 2);
        short shortDivision = (short) (minShort / 2);
        long longDivision = (minLong / 2);

        byte anyByte = 64;
        short anyShort = 16384;
        int anyInt = 1062783;
        long longResult = 50000 + (10 * (anyByte + anyShort + anyInt));
        System.out.println("Long Result = " + longResult);
    }
}
