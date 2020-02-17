package leecode;

import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		System.out.println(solution(" "));
	}

	public static int solution(String s) {
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		int begin = 0;
		int end = 0;
		int max = 0;
		while (end < arr.length) {
			if (!hMap.containsKey(arr[end])) {
				hMap.put(arr[end], end++);
				max = Math.max(max, end - begin);
				continue;
			}

			begin = hMap.get(arr[end]) + 1;
			end = begin;
			hMap.clear();
		}
		return max;
	}
}
