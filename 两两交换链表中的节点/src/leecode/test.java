package leecode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class test {
	public static void swap(ListNode head) {
		if (head.next != null && head.next.next != null && head.next.next.next != null) {
			ListNode temp = head.next;
			ListNode temp0 = temp.next;
			head.next = head.next.next.next;
			temp.next = head;
			swap(temp0);
		} else {
			ListNode temp = head.next;
			head.next = head.next.next;
			temp.next = head;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode begin = head.next;
		swap(head);
		return begin;
	}
}