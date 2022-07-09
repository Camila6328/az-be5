package Homework;

import java.io.BufferedReader;
import java.util.Scanner;

public class homwork1_2 {
//
//public static void main(String[]args){
//        String[][] arr = {{"1914","1995"},{"WW1","ww2"}};
//        System.out.println(arr[0][0]+"  "+arr[1][0]);
//
//        System.out.println(arr[0][1]+"  "+arr[1][1]);
//
//  }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = 0;
                while (n >= 0) {
                        String s = sc.nextLine();
                        try {
                                n = Integer.parseInt(s);
                        }
                        catch(Exception e) {
                                System.out.println("Try again");
                        }
                }

                }
}
