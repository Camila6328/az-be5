package lesson10;

import java.util.HashMap;

public class CounterApp {
    public static void main(String[] args) {

        String line = "Hello World!Java is awesome!";

        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            Character c = line.charAt(i);
            Integer cnt = counter.getOrDefault(c,0);
            counter.put(c, cnt + 1);
        }

        counter.forEach((letter, count) ->
        System.out.printf("letter %s, count %d\n",letter,count));

    }
}
