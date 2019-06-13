package com.oldjii.lib;

public class inorderTraversal {
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorder(root, list);
    }
    public List<Integer> inorder(TreeNode root, List<Integer> list) {
        if(root == null)
            return list;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }

    //迭代 + 栈
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         Deque<TreeNode> stack = new ArrayDeque<>();
//         TreeNode cur = root;

//         while(cur != null || !stack.isEmpty()) {
//             if(cur != null) {           //一直向left走，直到头
//                 stack.push(cur);
//                 cur = cur.left;
//             } else {                    //如果没right就添加父节点然后再找父节点的rigth
//                 cur = stack.pop();
//                 list.add(cur.val);
//                 cur = cur.right;
//             }
//         }
//         return list;
//     }
}
