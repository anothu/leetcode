package leecode;

import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		for (String s : new test().generateParenthesis(8))
			System.out.println(s);

	}

	public static void add(String s, int left, int right, int index, List<String> list) {
		if (left < 0 || right < 0 || index < 0)
			return;
		if (left == 0 && right == 0)
			list.add(s.toString());
		add(s + '(', left - 1, right, index + 1, list);
		add(s + ')', left, right - 1, index - 1, list);

	}

	public List<String> generateParenthesis(int n) {
		int index = 1;
		String s = "(";
		List<String> list = new LinkedList<String>();
		add(s, n - 1, n, index, list);
		return list;
	}
}