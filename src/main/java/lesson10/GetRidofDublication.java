package lesson10;

import java.util.List;
import java.util.Set;

import static lesson10.RandomNumbers.*;

public class GetRidofDublication {
    public static void main(String[] args) {
       // System.out.println(randomsNoUnique(20));
        List<Integer> randoms = randomsNoUnique(20);
        System.out.println(randoms);

        //System.out.println(randomsUnique(7));
        Set<Integer> rnd = randomsUnique(7);
        System.out.println(rnd);
    }
}
