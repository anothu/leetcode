package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(solution("4193 with words"));
	}

	public static int solution(String str) {
		char[] cStr = str.toCharArray();
		int i;
		double ret = 0;
		int flag = 1;
		for (i = 0; i < str.length(); i++) {
			if (cStr[i] == ' ')
				continue;
			else if (cStr[i] == '-') {
				flag = -1;
				i++;
				break;
			} else if (cStr[i] == '+') {
				i++;
				break;
			} else if (cStr[i] > '9' || cStr[i] < '0')
				return 0;
			break;
		}
		for (; i < str.length(); i++) {
			if (cStr[i] <= '9' && cStr[i] >= '0') {
				ret *= 10;
				ret += (cStr[i] - 48);
			} else
				break;
		}
		ret *= flag;
		if (ret < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (ret > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		return (int) ret;
	}
}
