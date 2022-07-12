package lesson4;

public class Blocks {
    public static void main(String[] args) {
        //1. print one char And move caret to the new line
        //System.out.println("*");
        // 2. print one char And do not move caret to the new line
        // System.out.print("*");
        // 3. just move the caret to the new line
        // System.out.println("");
        // 4.print more than one in one line
        int height = 10;
        int width  = 22;
        double k = (double) width/height;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                    if ( i == 0 || // firstrow
                         j == 0 || // firstcol
                         i == height-1 || // lastrow
                         j==width-1 || // lastcol
                         j == Math.round(i*k) || // dioganal1
                         j == width- 1 - Math.round(i*k) // dioganal2
                ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 6. comparing
                int x = 5;
                int y = 10;
                int z = x * y;
                if (z > 20) {
                    System.out.println("greater than 20");
                } else {
                    System.out.println("less than 20");
                }

    }
}
