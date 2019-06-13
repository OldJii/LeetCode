package com.oldjii.lib;

public class cloneGraph {
    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        Node n = new Node(node.val, null);
        map.put(node.val, n);
        n.neighbors = copy(node, map);
        return n;
    }

    private List<Node> copy(Node node, Map<Integer, Node> map) {
        List<Node> list = new ArrayList<>();            //根节点的neighbors
        for(Node n: node.neighbors) {
            if(map.containsKey(n.val))                  //判断该节点是否已经创建了
                list.add(map.get(n.val));
            else {
                Node nn = new Node(n.val, null);        //节点未创建，创建并拷贝nei***ors
                list.add(nn);
                map.put(n.val, nn);
                nn.neighbors = copy(n, map);            //递归
            }
        }
        return list;
    }
}
