package Lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CH {
    public static void main(String[] args) {
        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String []  numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};

        List <Character> letters1  = IntStream.rangeClosed(1,8)
                .mapToObj(n -> (char) ('a' + n - 1))
                .collect(Collectors.toList());

//        List<Integer> numbers1 = IntToDoubleFunction.
//                .boxed
    }

}
