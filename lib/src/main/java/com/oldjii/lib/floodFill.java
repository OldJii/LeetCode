package com.oldjii.lib;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old = image[sr][sc];
        dfs(image, sr, sc, old, newColor);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int old, int newColor) {
        if(!inArea(image, x, y))
            return;
        if(image[x][y] != old)
            return;
        if(image[x][y] == -1)
            return;

        image[x][y] = -1;
        dfs(image, x, y + 1, old, newColor);
        dfs(image, x, y - 1, old, newColor);
        dfs(image, x - 1, y, old, newColor);
        dfs(image, x + 1, y, old, newColor);
        image[x][y] = newColor;
    }

    public boolean inArea(int[][] image, int x, int y) {
        return x >= 0 && x < image.length && y >= 0 && y < image[0].length;
    }
}
