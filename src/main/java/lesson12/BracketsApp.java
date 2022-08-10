package lesson12;

import java.util.ArrayList;
import java.util.Stack;


public class BracketsApp {
    public static boolean isValid(String line) {
        //throw new IllegalStateException("Should be implemented");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch (c) {
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty()) return false;
                    stack.pop();
                    break;
                default:
                    // || } c == '}' || c == ')' || c == ']' || c == '>')
            }
        }
        return stack.isEmpty();
    }


}

//        if (line.length() % 2 == 1) {
//            return false;
//        } else {
//            char ch[] = line.toCharArray();
//            for (char c : ch) {
//                if (!(c == '{' || c == '(' || c == '[' || c == '<' || c == '}' || c == ')' || c == ']' || c == '>')) {
//                    return false;
//
//                }
//            }
//        }
//        return true;

//
//    public static void main(String[] args) {
//
//        String s = "{([<()>)}";
//        System.out.println(isValid(s));
//           // System.out.println(s.charAt(i));
//        }
//
//
//}
