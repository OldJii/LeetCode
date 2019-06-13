package com.oldjii.lib;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //

        int fl = 0;
        if(s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                return fl;
            }
            fl = fl + 1;
        }
        return s.length();
    }
}
