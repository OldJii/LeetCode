/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        return methodOne(head);
        // return methodTwo(head);
    }

    /**
     * 先反转链表再正常遍历
     **/
    private int[] methodOne(ListNode head) {
        ListNode rev = reverse(head);
        int[] res = new int[getLength(rev)];
        int i = 0;
        while(rev != null) {
            res[i] = rev.val;
            rev = rev.next;
            i++;
        }
        return res;
    }


    //反转链表
    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //计算链表长度
    private int getLength(ListNode head) {
        int res = 0;
        while(head != null) {
            res++;
            head = head.next;
        }
        return res;
    }

    /**
     * 入栈法：利用Stack先进后出的性质
     **/
    private int[] methodTwo(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int length;
        int[] res;
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        length = stack.size();
        res = new int[length];
        for(int i = 0; i < length; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }
}