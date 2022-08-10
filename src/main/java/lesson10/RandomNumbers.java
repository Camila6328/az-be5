package lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RandomNumbers {
    /* 7 random unique numbers in range 1 to 10*/

    public static ArrayList<Integer> randomsNoUnique(int number){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add((int)(Math.random()*10+1));
        }
        return result;
    }
    /* 7 random unique numbers in range 1 to 10*/

    public  static Set<Integer> randomsUnique(int number){
        HashSet<Integer> result = new HashSet<>();
        while( result.size() < number){
            result.add((int)(Math.random()*10+1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(randomsUnique(7));
        System.out.println(randomsNoUnique(7));
    }
}
