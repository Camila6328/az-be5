package lesson2;

import java.util.Scanner;

public class FaceControlApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = in.nextLine();
        System.out.print("Enter your age :");
        int age = in.nextInt();
        if ( age > 18 ){
              System.out.printf( "Hello %s %d", name , age);
        /* System.out.print("name : " + name + "\n");
            System.out.print("name : " + name);   */
        }
        else {
            System.out.println("Your are not adult");
        }

        String result = (age >= 8) ? "OK" : "NOT OK";
        System.out.println(result);
    }
}
