package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(solution(-1523134723));
	}

	public static int solution(int x) {
		long result = 0;
		for (; x != 0; x /= 10) {
			result *= 10;
			result += x % 10;
		}
		return (int) result == result ? (int) result : 0;
	}
}
