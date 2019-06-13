package com.oldjii.lib;

public class canVisitAllRooms {

    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];

        bfs(rooms);
        // dfs(rooms, 0);

        for(boolean v : visited)
            if(!v)
                return false;
        return true;
    }

    public void bfs(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        List<Integer> room;
        while(!queue.isEmpty()) {
            int roomNum = queue.poll();
            room = rooms.get(roomNum);
            visited[roomNum] = true;
            for(int key : room)
                if(!visited[key])
                    queue.offer(key);
        }
    }

    public void dfs(List<List<Integer>> rooms, int roomNum) {
        if(visited[roomNum])            //如果已经去过了就不用进行重复操作了，浪费时间
            return;
        visited[roomNum] = true;
        List<Integer> room = rooms.get(roomNum);
        for(int key : room)
            dfs(rooms, key);
    }
}
