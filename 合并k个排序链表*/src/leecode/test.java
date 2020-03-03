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

	public ListNode mergeKLists(ListNode[] lists) {
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while (true) {
			int smallest = Integer.MAX_VALUE;
			int index = 0;
			int empty = 0;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] == null) {
					empty++;
					continue;
				} else if (lists[i].val < smallest) {
					smallest = lists[i].val;
					index = i;
				}
			}
			if (empty == lists.length)
				return head.next;
			temp.next = lists[index];
			temp = temp.next;
			if (lists[index] != null)
				lists[index] = lists[index].next;
		}
	}
}