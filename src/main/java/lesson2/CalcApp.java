package lesson2;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args)
    {
//        int a = 5 ;
//        int b = 6 ;
        Scanner sn = new Scanner(System.in);
        int a = 0;
        int b = 9;
        System.out.print("Enter a: ");
        a = sn.nextInt();
        System.out.print("Enter b: ");
        b = sn.nextInt();
        System.out.print("sum of a& b: a+b = " + (a+b));



    }
}
