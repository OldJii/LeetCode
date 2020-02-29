/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // return methodOne(head, k);
        return methodTwo(head, k);
    }

    /**
     * 暴力：遍历两边，第一遍计算长度，第二遍找值
     **/
    public ListNode methodOne(ListNode head, int k) {
        int length = getLength(head);
        int dest = length - k, i = 0;
        while(head != null) {
            if(i == dest) {
                return head;
            }
            head = head.next;
            i++;
        }
        return head;
    }

    private int getLength(ListNode head) {
        int res = 0;
        while(head != null) {
            res++;
            head = head.next;
        }
        return res;
    }

    /**
     * 双指针法：after比before多走k次，"after == null"时，before位目标值
     **/
    public ListNode methodTwo(ListNode head, int k) {
        ListNode before = head, after = head;
        while(after != null) {
            after = after.next;
            if(k == 0) {
                before = before.next;
            }
            if(k > 0) {
                k--;
            }
        }
        return before;
    }
}