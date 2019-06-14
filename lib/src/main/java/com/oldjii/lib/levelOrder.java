package com.oldjii.lib;

//递归
public class levelOrder {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        if(levels.size() == level)              //level第0层，但也需要开辟一层空间
            levels.add(new ArrayList<Integer>());
        levels.get(level).add(node.val);
        if(node.left != null)
            helper(node.left, level + 1);
        if(node.right != null)
            helper(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return levels;
        helper(root, 0);
        return levels;
    }
}

//迭代
public class levelOrder {
     public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
         Queue<TreeNode> queue = new LinkedList<TreeNode>();

         if(root == null)
             return res;

         queue.add(root);
         int level = 0;
         while(!queue.isEmpty()) {
             res.add(new ArrayList<>());         //开辟当前层的空间

             int num = queue.size();             //该层结点数量
             for(int i = 0; i < num; i++) {      //将该层所有结点压入到上面开辟的那个空间
                 TreeNode node = queue.poll();
                 res.get(level).add(node.val);

                 if(node.left != null)
                     queue.add(node.left);
                 if(node.right != null)
                     queue.add(node.right);
             }
             level++;
         }

         return res;
     }
}
