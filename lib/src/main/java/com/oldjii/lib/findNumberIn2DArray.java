class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // return methodOne(matrix, target);
        return methodTwo(matrix, target);
    }

    /**
     * 暴力
     **/
    public boolean methodOne(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 标志位法（具有某些数据特性的位置称为标志位：本题中的左下角 / 右上角）
     **/
    public boolean methodTwo(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length) {
            if(matrix[i][j] > target) {
                i--;
            } else if(matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}