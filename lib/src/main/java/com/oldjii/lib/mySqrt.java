package com.oldjii.lib;

public class mySqrt {
    //首先，确定取值区间，使用二分查找法
    //注意最后返回值为int，使用long的话注意转换
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        long left = 0, right = 1 + x/2;
        while(left <= right) {
            long mid = (left + right) / 2;
            long midt = mid * mid;
            if(midt == x) {
                return (int) mid;
            } else if(midt > x){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }
    //总结：对于一个非负数n，它的平方根不会小于大于（n/2+1）
}
