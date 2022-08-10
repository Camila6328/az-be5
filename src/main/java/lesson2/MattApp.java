package lesson2;

import java.util.Scanner;

public class MattApp {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter NumberOne:");
        int num1 = in.nextInt();
        System.out.println("Enter NumberTwo:");
        int num2 = in.nextInt();

        //        int num1 = 15;
        //        int num2 = 6;

        int result = num1 - num2;
        System.out.println("result = "+result);
        int mult = num1 * num2;
        System.out.println("mutl = "+mult);
        float div = (float) num1 / num2;
        System.out.println("div = "+ div);
        int remainder = num1%num2;
        System.out.println("reminder = " + remainder);
        //        int power = 5^2;
        //        System.out.println("power = "+ power);
    }

    static class Cat {
        String name;
      //  public Cat(String name){this.name }
        static String format ="My name is %s";
    }
}
