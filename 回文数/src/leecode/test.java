package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(solu(-121));
	}

	public static boolean solu(int x) {
		int bef = x;
		int rev = 0;
		while (x > 0) {
			rev *= 10;
			rev += x % 10;
			x /= 10;
		}
		if (bef == rev)
			return true;
		return false;
	}

}
