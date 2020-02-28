class Solution {
    public String replaceSpace(String s) {
        // return methodOne(s);
        return methodtwo(s);
    }

    /**
     * 利用String.toCharArray()方法将字符串转化为char[]
     * 使用String
     **/
    public String methodOne(String s) {
        char[] c = s.toCharArray();
        String res = "";
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                res = res + "%20";
            } else {
                res = res + c[i];
            }
        }
        return res;
    }

    /**
     * 利用String.toCharArray()方法将字符串转化为char[]
     * 使用StringBuilder  -  执行时间明显缩减
     **/
    public String methodtwo(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}