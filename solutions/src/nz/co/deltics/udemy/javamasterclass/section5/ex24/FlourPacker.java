package nz.co.deltics.udemy.javamasterclass.section5.ex24;

public class FlourPacker {

    public static boolean canPack(int big, int small, int goal) {

        if ((big < 0) || (small < 0) || (goal < 0))
            return false;

        boolean result = ((big * 5) + small) >= goal;

        result = result && ((((goal / 5) * 5) + small) >= goal);

        return result;
    }

}
