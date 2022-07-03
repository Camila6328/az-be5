package lesson3;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] ar1;
        int ar2[];
        int []ar3;
        String []str = new String[10];
        byte [] arrByte = {53,44,55,1,2,3,4,7};

//         for ( int a : arrByte) {
//            System.out.println(a);
//        }

//        System.out.println(arrByte.length);
//        System.out.println(arrByte[4]);

//        for (int i = arrByte.length; i>0; i--)
//        {
//            System.out.println(i);
//        }

//        str[0] = "name" ;
//        str[1] = "Class" ;
//        str [7] = "One";
//        for (String st: str){
//            if (st == null) {
//
//            }else {
//                System.out.println(st);
//            }

        Arrays.sort(arrByte);
        for(int el: arrByte){
            System.out.println(el);
        }

    }
}
