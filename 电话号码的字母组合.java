import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 17. 电话号码的字母组合 回溯法 */
class Solution {
	static final String[] index = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> list =new LinkedList<>();
		StringBuilder sb =new StringBuilder();
		addList(digits, list, 0, sb);
		return list;
	}

	public void addList(String digits, List<String> list, int depth, StringBuilder sb) {
		if (depth == digits.length()) {
			list.add(sb.toString());
			return;
		}
		int i = depth;
		char c = digits.charAt(i);
		int num = c - '0' - 2;
		String temp = index[num];
		for (int j = 0; j < temp.length(); j++) {
			sb.append(temp.charAt(j));
			addList(digits, list, depth+1, sb);
			sb.deleteCharAt(depth);
		}

	}

	public static void main(String[] args) {
		System.out.println(new Solution().letterCombinations("234"));
	}
}
