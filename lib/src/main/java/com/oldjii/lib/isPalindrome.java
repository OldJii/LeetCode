package com.oldjii.lib;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int flag = 0;

        while(x > flag) {
            flag = flag * 10 + x % 10;
            x = x / 10;
        }

        return flag == x || x == flag / 10;
    }
}
