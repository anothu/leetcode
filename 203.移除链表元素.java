/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode front = new ListNode(0);
        ListNode result =front;
        front.next = head;
        while (head != null) {
            if (head.val == val) {
                front.next=head.next;
                head = head.next;
            } else {
                front = head;
                head=head.next;
            }
        }
        return result.next;
    }
}
// @lc code=end
