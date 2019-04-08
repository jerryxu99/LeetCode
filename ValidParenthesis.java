import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        Stack<Character> brackets = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (brackets.size() == 0) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    brackets.push(s.charAt(i));
                } else {
                    return false;
                }
            } else {
                switch (s.charAt(i)) {
                    case (')'):
                        if (brackets.peek().equals('(')) {
                            brackets.pop();
                        } else {
                            return false;
                        }
                        break;
                    case (']'):
                        if (brackets.peek().equals('[')) {
                            brackets.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ('}'):
                        if (brackets.peek().equals('{')) {
                            brackets.pop();
                        } else {
                            return false;
                        }
                        break;
                    default:
                        brackets.push(s.charAt(i));
                }
            }

        }
        if (brackets.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
