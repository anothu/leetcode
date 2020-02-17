package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(solution("PAYPALISHIRING", 4));
	}

	public static String solution(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		String out = "";
		char[] arr = s.toCharArray();
		if (numRows == 2) {
			for (int i = 0; i < arr.length; i += 2)
				out += arr[i];
			for (int i = 1; i < arr.length; i += 2) {
				out += arr[i];
			}
			return out;
		}
		boolean f = true;
		for (int i = 0; i < numRows; i++) {
			int j = i;
			if (i == 0 || i == numRows - 1) {
				while (j < arr.length) {
					out += arr[j];
					j += 2 * (numRows - 1);
				}
			} else {
				while (j < arr.length) {
					out += arr[j];
					if (f) {
						j += 2 * (numRows - i - 1);
						f = false;
					} else {
						j += 2 * i;
						f = true;
					}
				}
				f = true;
			}
		}
		return out;

	}
}
