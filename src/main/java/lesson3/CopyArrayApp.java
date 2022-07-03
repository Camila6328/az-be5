package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
public class CopyArrayApp {
    public static void main(String[] args) {
        int [] arrOne = {1, 2, 3};
        int [] arrTwo = new int [arrOne.length+2];

      //  arrTwo[0]= 7;
        for (int i = 0; i<arrOne.length; i++){
            arrTwo[i] = arrOne[i];
        }
        arrTwo[3]= 1;
      //  Arrays.fill(arrTwo, 5) ;
        //System.out.println(arrTwo.length);

        for (int el:arrTwo){
            System.out.println(el);
        }
    }
}
