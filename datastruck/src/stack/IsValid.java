package stack;

import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class IsValid {

    //    public boolean isValid(String s) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            switch (s.charAt(i) + "") {
//                case "[":
//                    a++;
//                    break;
//                case "{":
//                    b++;
//                    break;
//                case "(":
//                    c++;
//                    break;
//                case "]":
//                    a--;
//                    if (a < 0) {
//                        return false;
//                    }
//                    break;
//                case "}":
//                    b--;
//                    if (b < 0) {
//                        return false;
//                    }
//                    break;
//                case ")":
//                    c--;
//                    if (c < 0) {
//                        return false;
//                    }
//                    break;
//
//
//            }
//        }
//        return a == 0 && b == 0 && c == 0;
//    }
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            String left = "";
            switch (c) {
                case "{", "[", "(":
                    stack.push(c);
                    break;
                case "}":
                    if (stack.isEmpty()) return false;
                    left = stack.pop();
                    if (!Objects.equals(left, "{")) return false;
                    break;
                case ")":
                    if (stack.isEmpty()) return false;
                    left = stack.pop();
                    if (!Objects.equals(left, "(")) return false;
                    break;
                case "]":
                    if (stack.isEmpty()) return false;
                    left = stack.pop();
                    if (!Objects.equals(left, "[")) return false;
                    break;
            }

        }
        return stack.isEmpty();
    }
}
