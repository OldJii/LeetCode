package com.oldjii.lib;

public class romanToInt {
    public int romanToInt(String s) {
        int n = s.length();
        int re = 0;

        for(int i = 0; i < n; i++) {
            switch(s.charAt(i)) {
                case 'I':
                    re = re + 1;
                    break;
                case 'V':
                    re = re + 5;
                    break;
                case 'X':
                    re = re + 10;
                    break;
                case 'L':
                    re = re + 50;
                    break;
                case 'C':
                    re = re + 100;
                    break;
                case 'D':
                    re = re + 500;
                    break;
                case 'M':
                    re = re + 1000;
                    break;
                default:
                    System.out.println("default");
                    break;
            }

            if(i != 0) {
                if(((s.charAt(i) == 'V') || (s.charAt(i) == 'X')) && s.charAt(i - 1) == 'I')
                    re = re - 2;
                if(((s.charAt(i) == 'L') || (s.charAt(i) == 'C')) && s.charAt(i - 1) == 'X')
                    re = re - 20;
                if(((s.charAt(i) == 'D') || (s.charAt(i) == 'M')) && s.charAt(i - 1) == 'C')
                    re = re - 200;
            }
        }
        return re;
    }
}
