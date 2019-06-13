package com.oldjii.lib;

public class numIslands {
    int count = 0;

    public int numIslands(char[][] grid) {
        if(grid.length == 0)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == '1') {
                    // bfs(i, j, grid);
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    //DFS递归+隐式栈
    public void dfs(int x, int y, char[][] grid) {
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
            if(grid[x][y] == '1') {
                grid[x][y] = '0';
                dfs(x, y + 1, grid);
                dfs(x, y - 1, grid);
                dfs(x + 1, y, grid);
                dfs(x - 1, y, grid);
            }
        }
    }

    //***二维矩阵 + 上下左右***标准答题模板
    //BFS
    // public void bfs(int x, int y, char[][] grid) {
    //     int[][] change = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    //     Queue<int[]> q = new LinkedList<>();
    //     int[] d = {x, y};
    //     q.add(d);
    //     while(!q.isEmpty()) {
    //         int[] oq = q.poll();
    //         for(int i = 0; i < 4; i++) {
    //             int nx = oq[0] + change[i][0];
    //             int ny = oq[1] + change[i][1];
    //             if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == '1') {
    //                 int[] qs = {nx, ny};
    //                 q.add(qs);
    //                 //加入队列后进行标志
    //                 grid[nx][ny] = '0';     //在四个方向上相连的‘1’没有意义，所以变为0，最后的结果为：没有连续的大陆，只有单独的岛屿‘1’和遍地的‘0’
    //             }
    //         }
    //     }
    // }
}
