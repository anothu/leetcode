package leecode;

public class test {
	public static void main(String[] args) {
		System.out.print(sov("CIV"));
	}

	public static int romeMap(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public static int sov(String s) {
		int sum = 0;
		int index = 0;
		while (index < s.length() - 1) {
			if (romeMap(s.charAt(index)) >= romeMap(s.charAt(index + 1)))
				sum += romeMap(s.charAt(index));
			else
				sum += -romeMap(s.charAt(index));
			index++;
		}
		return sum + romeMap(s.charAt(s.length() - 1));
	}

}