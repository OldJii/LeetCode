package com.oldjii.lib;

//递归1
public class maxDepth {
    int maxlevel = 0;

    public int maxDepth(TreeNode root) {
        pre(root, 1);
        return maxlevel;
    }

    public void pre(TreeNode root, int level) {
        if(root == null)
            return;
        if(level > maxlevel)
            maxlevel = level;
        pre(root.left, level + 1);
        pre(root.right, level + 1);
    }
}

//递归2
public class maxDepth {
     public int maxDepth(TreeNode root) {
         return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
     }
}

//迭代 - 层序遍历二叉树的方法
public class maxDepth {
     public int maxDepth(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
         if(root == null)
             return 0;
         queue.add(root);
         int level = 0;
         while(!queue.isEmpty()) {
             int num = queue.size();
             for(int i = 0; i < num; i++) {
                 TreeNode node = queue.poll();
                 if(node.left != null)
                     queue.add(node.left);
                 if(node.right != null)
                     queue.add(node.right);
             }
             level++;
         }
         return level;
     }
}
