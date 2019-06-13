package com.oldjii.lib;

public class reverse {
    public int reverse(int x) {
        int re = 0, te = 10;

        while(x != 0) {
            te = re * 10 + x % 10;
            //Integer类型溢出，Java中不报错，而是变为负数
            if(te / 10 != re)
                return 0;
            re = te;
            x /= 10;
        }

        return re;
    }
}
