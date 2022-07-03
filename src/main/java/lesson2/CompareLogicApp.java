package lesson2;

import java.util.Scanner;

public class CompareLogicApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How old are you?:");
        int age = in.nextInt();
        System.out.print("How many brothers you have?:");
        int numOfBrothers = in.nextInt();

        if ( age >= 18 && numOfBrothers > 0 && true)
        {
            System.out.printf( "Age: %d, You have %d brothers \n", age ,numOfBrothers);
        } else {
            System.out.println("Hi");
        }

        if ( age >= 18 && numOfBrothers > 0 || false)
        {
            System.out.printf( "Age: %d, You have %d brothers \n", age ,numOfBrothers);
        } else {
            System.out.println("Hi");
        }


    }
}
