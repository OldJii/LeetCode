package com.oldjii.lib;

public class strStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals(null))
            return 0;

        int indexi = haystack.indexOf(needle);
        return indexi;
    }
}
