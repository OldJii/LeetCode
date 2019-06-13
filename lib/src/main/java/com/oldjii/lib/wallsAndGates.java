package com.oldjii.lib;

public class wallsAndGates {
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length == 0)
            return;
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j] == 0)
                    bfs(rooms, i, j);
            }
        }
    }

    public void bfs(int[][] rooms, int i, int j) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>(); //已访问过的，防止重复访问
        int dist = 0;   //深度

        queue.offer(i * rooms[i].length + j);
        visited.add(i * rooms[i].length + j);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                Integer cur = queue.poll();
                int row = cur / rooms[0].length;
                int col = cur % rooms[0].length;

                rooms[row][col] = Math.min(rooms[row][col], dist);

                int up = (row - 1) * rooms[0].length + col;
                int down = (row + 1) * rooms[0].length + col;
                int left = row * rooms[0].length + col - 1;
                int right = row * rooms[0].length + col + 1;

                if(row > 0 && rooms[row - 1][col] > 0 && !visited.contains(up)) {
                    queue.offer(up);
                    visited.add(up);
                }
                if(col > 0 && rooms[row][col - 1] > 0 && !visited.contains(left)){
                    queue.offer(left);
                    visited.add(left);
                }
                if(row < rooms.length - 1 && rooms[row + 1][col] > 0 && !visited.contains(down)){
                    queue.offer(down);
                    visited.add(down);
                }
                if(col < rooms[0].length - 1 && rooms[row][col + 1] > 0 && !visited.contains(right)){
                    queue.offer(right);
                    visited.add(right);
                }
            }
            dist = dist + 1;
        }
    }
}
