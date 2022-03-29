package leetcode.easy;

import java.util.Stack;

/**
 * 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class IsValidBrackets {
    public static boolean isValidBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        char[] chars = s.toCharArray();
        char charV;
        for (int i = 0; i < chars.length; i++) {
            charV = chars[i];
            if(charV == '(' || charV == '[' || charV == '{'){
                stack.add(charV);
            }else if(charV == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            } else if(charV == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            } else if(charV == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
