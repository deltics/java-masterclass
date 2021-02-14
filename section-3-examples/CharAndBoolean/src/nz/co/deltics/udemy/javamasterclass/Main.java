package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u00A9';
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("Char MIN = " + minChar);
        System.out.println("Char MAX = " + maxChar);
        System.out.println("Unicode Char = " + myUnicodeChar);

        String copyrightNotice = "\u00a92020";
        System.out.println("Copyright = " + copyrightNotice);
    }
}
