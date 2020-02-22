package leecode;

public class test {
	public static void main(String[] args) {
		String s[] = { "a" };
		System.out.print(sov(s));
	}

	public static String sov(String[] strs) {
		if (strs.length == 0)
			return "";
		for (int index = 0; index < strs[0].length(); index++) {
			char temp = strs[0].charAt(index);
			for (String s : strs) {
				if (s.length() <= index || s.charAt(index) != temp)
					return strs[0].substring(0, index);
			}
		}
		return strs[0];
	}

}