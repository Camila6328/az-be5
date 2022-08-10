package lesson12;

import java.util.Stack;

public class BracketsV1 {

        private static String opens = "[(<{";
        private static String closes = "])>}";
        public boolean bracketCorrosponds(char close, char open){

            return opens.indexOf(open) == closes.indexOf(close);
        }
        public boolean isValid(String line) {
            //throw new IllegalStateException("Should be implemented");
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(opens.indexOf(c)!=-1) stack.push(c);
                else if (closes.indexOf(c)!= -1){
                    if (stack.isEmpty()) return false;
                    char saved= stack.pop();
                    if(!bracketCorrosponds(c, saved)) return false;
                }
            }
            return stack.isEmpty();
        }
    }

