package nz.co.deltics.udemy.javamasterclass;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kb) {

        String s = "Invalid Value";
        int orgKb = kb;

        if (orgKb >= 0) {
            int mb = kb / 1024;
            kb = kb % 1024;
            s = orgKb + " KB = " + mb + " MB and " + kb + " KB";
        }
        System.out.println(s);
    }

}

