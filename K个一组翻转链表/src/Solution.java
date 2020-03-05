import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
	public ListNode next(Stack st, ListNode head, int k) {
		ListNode begin = head;
		for (int i = 0; i < k; i++) {
			if (head != null) {
				st.push(head);
				head = head.next;
			} else
				return begin;
		}
		begin = (ListNode) st.pop();
		ListNode start = begin;
		for (; !st.isEmpty();) {
			begin.next = (ListNode) st.pop();
			begin = begin.next;
		}
		if (head != null)
			begin.next = next(st, head, k);
		else
			begin.next = null;
		return start;
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		Stack<ListNode> st = new Stack<ListNode>();
		head = next(st, head, k);
		return head;
	}

	public static void main(String[] args) {

	}
}
