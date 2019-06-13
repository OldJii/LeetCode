package com.oldjii.lib;

public class numSquares {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.offer(0);
        visited[0] = true;
        int step = 1;

        while(!queue.isEmpty()) {
            for(int i = queue.size(); i > 0; i--) {
                int cur = queue.poll();
                for(int j = 1; ; j++) {
                    int next = cur + j * j;     //这里理解不太深刻
                    if(next > n)
                        break;
                    if(next == n)
                        return step;
                    if(next < n && !visited[next]) {
                        queue.add(next);
                        visited[next] = true;
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
