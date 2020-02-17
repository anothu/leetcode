package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(solution("ccc"));
	}

	public static String solution(String s) {
		if (s.equals(""))
			return "";
		char[] arr = s.toCharArray();
		int maxDeepth = 0;
		String result = "";
		int index = 0;
		boolean ji = true;
		// 回文个数为奇数
		for (int i = 1; i < arr.length - 1; i++) {
			int deepth = 1;
			while (i - deepth >= 0 && i + deepth < arr.length) {
				if (arr[i - deepth] == arr[i + deepth]) {
					deepth++;
					if (deepth - 1 > maxDeepth) {
						maxDeepth = deepth - 1;
						index = i;
					}
					continue;
				}
				break;
			}
		}
		// 回文个数为o数
		for (int i = 0; i < arr.length - 1; i++) {
			int deepth = 0;
			while (i - deepth >= 0 && i + deepth + 1 < arr.length) {
				if (arr[i - deepth] == arr[i + deepth + 1]) {
					deepth++;
					if (deepth * 2 > 2 * maxDeepth + 1) {
						maxDeepth = deepth;
						index = i;
						ji = false;
					}
					continue;
				}
				break;
			}
		}
		if (ji) {
			for (int i = index - maxDeepth; i <= index + maxDeepth; i++)
				result += arr[i];
			return result;
		}
		for (int i = index - maxDeepth + 1; i <= index + maxDeepth; i++)
			result += arr[i];
		return result;
	}
}
