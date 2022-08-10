package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public ArrayList<Integer> myNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(11);
        numbers.add(3);
        numbers.add(-33);
        numbers.add(-3);
        numbers.add(0);
     return numbers;
    }

    public ArrayList<Integer> negativeValue() {
        ArrayList<Integer> negVal = new ArrayList<Integer>();
        Test t = new Test();
        System.out.println(t.myNumbers());
        for (int val:t.myNumbers()) {
            if (val < 0)
            negVal.add(val);
        }
        return negVal;
    }
    public ArrayList<Integer> positiveValue() {
        ArrayList<Integer> posVal = new ArrayList<Integer>();
        Test t = new Test();
       // System.out.println(t.myNumbers());
        for (int val:t.myNumbers()) {
            if (val >= 0)
                posVal.add(val);
        }
        return posVal;
    }

}
