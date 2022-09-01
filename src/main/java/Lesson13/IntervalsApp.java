package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IntervalsApp {
    public static void main(String[] args) {
        List<Integer> xs = Arrays.asList(1, 2, 3);
        Consumer<Integer> pr = new Consumer<>() {
            @Override
            public void accept(Integer x) {
                System.out.printf("value", x);
            }

        };
        xs.forEach(x ->System.out.println(x));
        xs.forEach(x ->pr.accept(x));
    }
}
