package leecode;

public class test {
	public static void main(String[] args) {
		System.out.print(sov(1));
	}

	public static String sov(int num) {
		String[][] table = { { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }, { "", "M", "MM", "MMM" } };
		String s = "";
		int index;
		for (int i = 0; i < 4; i++) {
			index = num % 10;
			num /= 10;
			s = table[i][index] + s;
		}
		return s;
	}

}