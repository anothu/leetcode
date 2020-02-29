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
		ListNode a = new ListNode(1);
		System.out.println(sov(a, 1));
	}

	public static ListNode sov(ListNode head, int n) {

		ListNode before = new ListNode(100);
		before.next = head;
		ListNode lNode = before;
		ListNode rNode = before;
		int index = 0;
		while (rNode.next != null) {
			rNode = rNode.next;
			index++;
			if (index > n)
				lNode = lNode.next;
		}
		lNode.next = lNode.next.next;
		return lNode.next;

	}

}