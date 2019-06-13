package com.oldjii.lib;

public class climbStairs {
    //使用递归，不是递归函数，是变量递归运算
    //与斐波那契数列（的和）十分相似
    public int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int st1 = 1, st2 = 2, re = 0;
        for(int i = 3; i <= n; i++) {
            re = st1 + st2;
            st1 = st2;
            st2 = re;
        }
        return re;
    }
}
