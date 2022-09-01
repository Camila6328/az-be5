package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval_task {
    public static void main(String[] args) {
        int c;
        List<List<Integer> >ls =Arrays.asList(Arrays.asList(1,10),Arrays.asList(1,4), Arrays.asList(2,7),
        Arrays.asList(5,8),Arrays.asList(1,3),Arrays.asList(7,8));
        for (int i = 1; i < 9 ; i++) {
            c=0;
            for (int j = 0; j < 6; j++) {
                if ( i >= ls.get(j).get(0) && i+1 <= ls.get(j).get(1)){
                    c++;
            }
            }System.out.println( i + " -- " + (i+1) + " -> "  + c);
        }
    }
}
