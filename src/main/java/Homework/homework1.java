package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        System.out.println("homework part1");
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
                num = Integer.parseInt(s);
                if (val > num) {
                    System.out.println("Your number is too small.");
                    arr[i] = num;
                } else if (val < num) {
                    arr[i] = num;
                    System.out.println("Your number is too big. Please, try again." + " ");
                } else {
                    arr[i] = num;
                    System.out.printf("Congratulations,{%s}!", name);
                    break;
                }
                i++;
                a = i + 1;
            }
            catch (Exception e){
                System.out.print("Try again: ");
            }
        }
        System.out.println();
        Arrays.sort(arr);
        for ( int j = arr.length -1; j >=arr.length -a; j--) {
            System.out.print(arr[j]+" ");
        }

        System.out.println();
        System.out.println("Homework part2"+"\n");

        String[][] arr3 = {{"1914","1939","1988","2020"},
                {"World War I", "World War II","First Nagorno-Karabakh War","The Second Karabakh War"}};
        int rnd1 = new Random().nextInt(3);
        System.out.println("When did the "+ arr3[1][rnd1] +" begin?" + " - " + arr3[0][rnd1]);

    }
}
