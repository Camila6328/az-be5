package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        String name = "Jamila";
        int arr[] = new int[100];
        Random rnd = new Random();
        int val = rnd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println(val);
        System.out.println("Let the game begin!");
        int i=0;
        int num = 0;
        int a = 0;
        while (num >= 0) {
            String s = sc.nextLine();
            try {
               // int num = sc.nextInt();
                num = Integer.parseInt(s);
               // int[] newArray = new int[arr.length + 1];
                if (val > num) {
                    System.out.println("Your number is too small.");
                    arr[i] = num;
                } else if (val < num) {
                    arr[i] = num;
                    System.out.println("Your number is too big. Please, try again." + "  ");
                } else {
                    arr[i] = num;
                    System.out.printf(" " + "Congratulations,{%s}!", name);
                    break;
                }
                i++;
               a = i + 1;
            }
            catch (Exception e){
                System.out.print("Try again: ");
        }
            }
       // System.out.println(a);
        System.out.println();
        Arrays.sort(arr);
        //int arr2[] = new int[a];
            for ( int j = arr.length -1; j >=arr.length -a; j--) {
              //  arr2[j]=arr[j];
                System.out.print(arr[j]+"  ");
                }
         }
//        Arrays.sort(arr2);
//        for ( int j = 0 ; j < a; j++) {
//            System.out.print(arr2[j] + "  ");
//        }


}
