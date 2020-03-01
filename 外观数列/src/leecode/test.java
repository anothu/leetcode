package leecode;

public class test {
	public static void main(String[] args) {
		System.out.println(new test().countAndSay(2));

	}

	public String countAndSay(int n) {
		String now = "1";
		int num = 1;
		for (int i = 0; i < n - 1; i++) {
			StringBuffer temp = new StringBuffer();
			for (int index = 0; index < now.length(); index++) {
				if (index + 1 < now.length() && now.charAt(index) == now.charAt(index + 1)) {
					num++;
					continue;
				}
				temp.append(num);
				num = 1;
				temp.append(now.charAt(index));
			}
			now = temp.toString();
		}
		return now;
	}
}