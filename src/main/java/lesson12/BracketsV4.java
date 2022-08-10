package lesson12;

import java.lang.reflect.Array;
import java.util.*;

public class BracketsV4 {
    private static Set<Character> opens = new HashSet<>(Arrays.asList('{','[','<','('));
    private static Set<Character> closes = new HashSet<>(Arrays.asList('}',']','>',')'));
    private static Map<Character,Character> pairs = new HashMap<>();
    static {
        pairs.put('(',')');
        pairs.put('[',']');
        pairs.put('{','}');
        pairs.put('<','>');
    }
    public boolean bracketCorresponds( char close, char open){
        return pairs.containsKey(open) && pairs.get(open)== close;
    }
    public boolean bracketCorrosponds(char close, char open){
        return opens.contains(open) == closes.contains(close);
    }
    private static Set<Character> close = new HashSet<>(pairs.values());
    public boolean isValid(String line) {
        //throw new IllegalStateException("Should be implemented");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(pairs.containsKey(c)){stack.push(c);}
            else if (close.contains(c)){
                if (stack.isEmpty()) return false;
                char saved = stack.pop();
                if(!bracketCorrosponds(c, saved)) return false;}
        }
        return stack.isEmpty();
    }
}
