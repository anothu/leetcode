import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Deque<Integer> d=new LinkedList<>();
        while(head!=null){
            d.addLast(head.val);
            head=head.next;
        }
        head =new ListNode(0);
        ListNode start=head;       
        while(true){
            Integer i = d.pollLast();
            if(i==null)
                return start.next;
            ListNode l =new ListNode(i) ;
            head.next=l;
            head=head.next;
        }
    }
}
// @lc code=end

