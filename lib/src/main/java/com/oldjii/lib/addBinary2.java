package com.oldjii.lib;

public class addBinary2 {
    public String addBinary(String a, String b) {
        int length_a = a.length() - 1;
        int length_b = b.length() - 1;
        StringBuilder re = new StringBuilder();
        int sum = 0;

        while(length_a >= 0 || length_b >= 0) {
            if(length_a >= 0) {
                sum = sum + (a.charAt(length_a) - '0');
                length_a--;
            }
            if(length_b >= 0) {
                sum = sum + (b.charAt(length_b) - '0');
                length_b--;
            }
            if(sum == 2) {
                re.append(0);
                sum = 1;
            } else if(sum == 3) {
                re.append(1);
                sum = 1;
            } else {
                re.append(sum);
                sum = 0;
            }
        }
        if(sum == 1) {
            re.append(1);
        }
        return re.reverse().toString();
    }
}
