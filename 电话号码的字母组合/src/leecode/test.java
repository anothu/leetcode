package leecode;

import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		System.out.println(name("2"));
	}

	public static void add(String result, int index, String digits, List list, String[] change) {
		String temp = change[(int) digits.charAt(index) - 50];

		for (int i = 0; i < temp.length(); i++) {
			if (result.length() + 1 == digits.length())
				list.add(result + temp.charAt(i));
			else
				add(result + temp.charAt(i), index + 1, digits, list, change);

		}
	}

	public static List name(String digits) {
		List<String> list = new LinkedList<String>();
		if (digits.length() == 0) {
		} else {
			String[] change = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
			String result = "";
			add(result, 0, digits, list, change);
		}
		return list;
	}
}