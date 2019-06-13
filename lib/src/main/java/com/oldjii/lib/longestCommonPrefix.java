package com.oldjii.lib;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String re = strs[0];

        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(re) != 0) {
                re = re.substring(0, re.length() - 1);
                if(re.isEmpty())
                    return "";
            }
        }

        return re;
    }
}
