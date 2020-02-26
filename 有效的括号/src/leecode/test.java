package leecode;

import java.util.Stack;

public class test {
	public static void main(String[] args) {
		// "123"
		System.out.println(letterCombinations("{(}"));
	}

	public static boolean letterCombinations(String s) {
		Stack<Character> st = new Stack<Character>();
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				st.push(c);
				continue;
			} else if (!st.isEmpty()
					&& (st.peek() == '(' && c == ')' || st.peek() == '[' && c == ']' || st.peek() == '{' && c == '}')) {
				st.pop();
				continue;
			}

			return false;
		}
		return true;

	}

}