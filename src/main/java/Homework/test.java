package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr_pos = new int[25][2];

      //  arr_pos= new int[][]{{1, 3}, {2, 3}};
       // while (true) {
        System.out.print("ENTER row id: ");
            int s_row = sc.nextInt();
        System.out.print("ENTER Col id: ");
            int s_col = sc.nextInt();

            arr_pos[0] = new int[]{5, 2};
            arr_pos[24] = new int[]{s_row,s_col};

       // }
        for(int i = 0; i< 25;i++)
        {
            System.out.println(Arrays.toString(arr_pos[i]));

        }


    }
}
