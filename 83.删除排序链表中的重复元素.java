/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
// class ListNode {
//         int val;
//         ListNode next;
//         ListNode(int x) { val = x; }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode begin =head;
        while(head!=null&&head.next!=null){
            if(head.next.val==head.val){
                ListNode temp = head.next.next;
                while(temp!=null&&temp.val==head.val)
                    temp=temp.next;
                head.next=temp;
            }
            head=head.next;
        }
        return begin;
    }
    // public static void main(String[] args) {
    //     ListNode a=new ListNode(1);
    //     ListNode b =new ListNode(1);
    //     ListNode c =new ListNode(2);
    //     a.next=b;
    //     b.next=c;
    //     System.out.println(new Solution1().deleteDuplicates(a));
    // }
}
// @lc code=end

