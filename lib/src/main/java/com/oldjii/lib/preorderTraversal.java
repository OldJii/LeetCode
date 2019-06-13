package com.oldjii.lib;

public class preorderTraversal {
    //递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return pre(root, list);
    }
    public List<Integer> pre(TreeNode root, List<Integer> list) {
        if(root == null)
            return list;
        list.add(root.val);
        pre(root.left, list);
        pre(root.right, list);
        return list;
    }

    //迭代 + 栈
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         Deque<TreeNode> stack = new ArrayDeque<>();

//         if(root == null)
//             return list;

//         //将节点存储到栈中，又把从栈中取出的节点的左右节点存储到栈中，这样就形成了迭代
//         stack.push(root);
//         while(!stack.isEmpty()) {
//             TreeNode temp = stack.pop();
//             list.add(temp.val);
//             if(temp.right != null)          //注意，由于栈FIFO的特性，先把右子树入栈才能保证左子树先出栈
//                 stack.push(temp.right);
//             if(temp.left != null)
//                 stack.push(temp.left);
//         }
//         return list;
//     }
}
