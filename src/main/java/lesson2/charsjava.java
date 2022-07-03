package lesson2;

import java.io.PrintStream;
import java.util.Scanner;

public class charsjava {
    public static void main(String[] args)
    {
    System.out.println();

    PrintStream out = System.out;
    //out.println();
    Scanner sn = new Scanner(System.in);
    out.println("What is your name ? - ");
    String MyName = sn.nextLine();
    out.println("how is your Age ? - ");
    int age = sn.nextInt();
    out.println("Hello, My name is: " + MyName + " and my age " + age);

    //


    }
}
