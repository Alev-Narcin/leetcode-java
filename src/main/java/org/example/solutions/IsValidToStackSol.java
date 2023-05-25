package org.example.solutions;

import java.util.Stack;

public class IsValidToStackSol {
    public boolean isValidToStack(String value) {
        char[] chars = value.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char aChar : chars) {
            if (aChar == '{' || aChar == '[' || aChar == '(') {
                stack.push(aChar);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    if (aChar == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (aChar == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (aChar == ')' && stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
        }

        return stack.empty();
    }
}
