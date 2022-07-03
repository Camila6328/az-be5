package lesson3;

import java.util.Random;
import java.util.Scanner;


/// (max - min +1)- min
public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random() ;

        System.out.print("Enter a size: ");
        int num = sc.nextInt();

        for ( int i = 1; i<=num ; i++) {
                char ch = (char) (rnd.nextInt(26)+97);

            System.out.print(ch+ " ");
        }
    }
}
