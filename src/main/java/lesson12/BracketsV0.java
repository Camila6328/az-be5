package lesson12;

import java.util.Stack;

public class BracketsV0 {

    public boolean bracketCorrosponds(char close, char open){
        String opens = "[(<{";
        String closes = "])>}";
        return opens.indexOf(open) == closes.indexOf(close);
    }
    public boolean isValid(String line) {
        //throw new IllegalStateException("Should be implemented");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch (c) {
                case '{':
                case '(':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ')':
                case ']':
                case '>':
                    if (stack.isEmpty()) return false;
                    char saved= stack.pop();
                    if(!bracketCorrosponds(c, saved)) return false;
                    break;
                default:
                    // || } c == '}' || c == ')' || c == ']' || c == '>')
            }
        }
        return stack.isEmpty();
    }
}
