package com.oldjii.lib;

public class decodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        String res = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ']') {                   //']'不压入栈，'['先压入之后会取出，所以说，最后的栈中就是解码完的字符串
                String string = "";                    //要重复的字符串
                String countString = "";               //获取重复的次数
                String retString = "";                 //执行完重复操作的结果

                while(!stack.peek().equals("["))
                    string = stack.pop() + string;
                stack.pop();

                while((!stack.isEmpty()) && (stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9'))
                    countString = stack.pop() + countString;
                int count = Integer.parseInt(countString);

                for(int j = 0; j < count; j++)
                    retString = retString + string;
                stack.push(retString);
            } else {
                String str = "" + s.charAt(i);
                stack.push(str);
            }
        }
        while(!stack.isEmpty())
            res = stack.pop() + res;
        return res;
    }
}
