package nz.co.deltics.udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float MIN = " + minFloat);
        System.out.println("Float MAX = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double MIN = " + minDouble);
        System.out.println("Double MAX = " + maxDouble);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5 / 3;
        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        // lbs to Kgs
        double POUND_IN_KG = 0.45359237;
        int lbs = 5;
        double kgs = lbs * POUND_IN_KG;
        System.out.println(lbs + "lbs = " + kgs + "kgs");
    }
}
