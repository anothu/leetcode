import sun.security.util.Length;

/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {       
        ListNode index = head;
        int size = 0;
        while(index!=null){
            size++;
            index = index.next;
        }
        if(size==0||size==1)return head;
        k = k%size;
        if(k==0) return head;
        ListNode right = head;
        for(int i=0;i<k;i++){
            right =right.next;
        }
        ListNode left =head;
        while(right.next!=null){
            left = left.next;
            right = right.next;
        }
        ListNode newStart = left.next;
        left.next = null;
        right.next = head;
        return newStart;
        
    }
}
// @lc code=end

