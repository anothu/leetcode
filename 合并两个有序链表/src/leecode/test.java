package leecode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class test {
	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode start;
		ListNode temp;
		if (l1.val > l2.val) {
			start = l2;
			l2 = l2.next;
		} else {
			start = l1;
			l1 = l1.next;
		}
		temp = start;
		while (true) {
			if (l1 == null) {
				temp.next = l2;
				break;
			}
			if (l2 == null) {
				temp.next = l1;
				break;
			}
			if (l1.val > l2.val) {
				temp.next = l2;
				temp = temp.next;
				l2 = l2.next;
			} else {
				temp.next = l1;
				temp = temp.next;
				l1 = l1.next;
			}

		}
		return start;
	}

}