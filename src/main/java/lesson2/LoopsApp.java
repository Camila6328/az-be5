package lesson2;

import java.util.Random;

public class LoopsApp {
    public static void main(String[] args) {
        Random rnd = new Random();

        for ( int i = 0; i < 10; ++i ) {
            // System.out.println(rnd.nextInt( 10));
           //  System.out.print("i\n"+ i);

            for ( int j = 0; j < 10; j++)
            {
                // System.out.print("j" + j);
            }
       }

        for (int i = 0; i < 10;i++){
            //  i=i+1;
            if (i % 2 == 0){
               // System.out.println("i:"+i);
                continue;  // skip
            }
            if ( i == 5){
                break;
            }
            System.out.println(i);
        }
        //        System.out.println("test");
        //        int intOne = 1;
        //        int intTwo = 1;
        //
        //        System.out.println(intOne++);
        //        System.out.println(++intTwo);
    }
}
