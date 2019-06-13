package com.oldjii.lib;

public class deleteDuplicates {
    //让他遍历一遍就是了，每次与next比较，相同就覆盖，否则继续遍历
    public ListNode deleteDuplicates(ListNode head) {
        ListNode headN = head;
        while(headN != null && headN.next != null) {
            if(headN.val == headN.next.val)
                headN.next = headN.next.next;   //不要陷入错误思维，这里的headN.next不要看作一个新节点，要看作是headN的一个成员属性
            else headN = headN.next;
        }
        return head;
    }
}
