import java.util.LinkedList;
import java.util.List;

class Solution {
	public boolean isHui(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public void addToList(String s, int start, LinkedList<String> list, List<List<String>> result) {
		if (start == s.length()) {
//			int index = 0;
//			for (String temp : list) {
//				index += temp.length();
//			}
//			if (index == s.length())
			result.add(new LinkedList<String>(list));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			if (isHui(s, start, i)) {
				list.add(s.substring(start, i + 1));
				addToList(s, i + 1, list, result);
				list.removeLast();
			}
		}

	}

	public List<List<String>> partition(String s) {
		List<List<String>> result = new LinkedList<List<String>>();
		LinkedList<String> list = new LinkedList<String>();
		addToList(s, 0, list, result);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().partition("abaaba"));
	}

}
