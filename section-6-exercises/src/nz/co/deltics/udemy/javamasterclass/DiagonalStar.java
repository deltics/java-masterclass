package nz.co.deltics.udemy.javamasterclass;

public class DiagonalStar {

    public static void printSquareStar(int num) {

        if (num < 5) {
            System.out.println("Invalid Value");
            return;}

        StringBuilder builder = new StringBuilder();
        for(int i = 1; i <= num; i++)
            builder.append('*');

        String fullRow = builder.toString();

        for(int row = 1; row <= num; row++) {
            if ((row ==1) || (row == num)) {
                System.out.println(fullRow);
                continue;
            }

            builder = new StringBuilder();
            for(int col = 1; col <= num; col++) {
                if ((col == 1 )|| (col == num) || (col == num - row + 1) || (col == row)) {
                    builder.append('*');
                } else {
                    builder.append(' ');
                }
            }
            System.out.println(builder.toString());
        }
    }
}
