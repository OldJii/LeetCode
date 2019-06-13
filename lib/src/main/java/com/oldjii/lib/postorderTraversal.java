package com.oldjii.lib;

public class postorderTraversal {
    //递归
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return post(root, list);
    }
    public List<Integer> post(TreeNode root, List<Integer> list) {
        if(root == null)
            return list;
        post(root.left, list);
        post(root.right, list);
        list.add(root.val);
        return list;
    }



    //递归 + 栈
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         Deque<TreeNode> stack = new ArrayDeque<>();

//         if(root == null)
//             return list;

//         stack.push(root);
//         while(!stack.isEmpty()) {
//             TreeNode temp = stack.pop();
//             list.add(temp.val);
//             if(temp.left != null)
//                 stack.push(temp.left);
//             if(temp.right != null)
//                 stack.push(temp.right);
//         }
//         Collections.reverse(list);
//         return list;
//     }
}
