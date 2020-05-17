/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//24. 两两交换链表中的节点：递归法
class Solution{
    public ListNode swap(ListNode first){
        if(first==null)
            return null;
        if(first.next==null)
            return first;
        ListNode second = first.next;
        ListNode third = second.next;
        second.next=first;
        first.next=swap(third);
        return second;
    }
    public ListNode swapPairs(ListNode head) {  
        return swap(head);
    }
}