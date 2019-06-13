package com.oldjii.lib;

public class isValid {
    public boolean isValid(String s) {
        //利用栈的性质，先进后出
        //Deque - 双向队列
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if(stack.peek() == '(' && s.charAt(i) != ')') {
                        return false;
                    } else if(stack.peek() == '[' && s.charAt(i) != ']') {
                        return false;
                    } else if(stack.peek() == '{' && s.charAt(i) != '}') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
