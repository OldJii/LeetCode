package com.oldjii.lib;

public class plusOne {
    public int[] plusOne(int[] digits) {
        //围绕：最后一位是否 == 9 展开思考
        //一共有两种情况：1.最后一位 < 9; 2.最后一位 == 9;
        //其中第二情况还有两种情况：1.不用扩展数组长度; 2.数组长度变长，手动扩展
        int size = digits.length;
        if(digits[size - 1] < 9) {
            digits[size - 1] = digits[size - 1] + 1;
            return digits;
        } else {
            for(int i = size - 1; i >= 0; i--) {
                if(digits[i] == 9) {
                    if(i == 0) {
                        int[] newdig = new int[size + 1];
                        newdig[0] = 1;
                        for(int j = 1; j <= size; j++) {
                            newdig[j] = 0;
                        }
                        return newdig;
                    } else {
                        digits[i] = 0;
                    }
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        }
        return digits;
    }
}
