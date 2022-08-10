package lesson10;

import java.sql.SQLOutput;
import java.util.ArrayList;

//public class ArrayListTask {

public class ArrayListTask{
        public static void main(String[] args){
                    Test t = new Test();
                    ArrayList<Integer> arr = t.myNumbers();        // You can catch the returned integer arraylist into an arraylist.
                    ArrayList<Integer> negvarr = t.negativeValue();
                    ArrayList<Integer> posvarr = t.positiveValue();
            System.out.println(arr);
            System.out.println(negvarr);
            System.out.println(posvarr);

        }



        }



