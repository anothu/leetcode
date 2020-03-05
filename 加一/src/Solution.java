class Solution {

	public int[] plusOne(int[] digits) {
		int plus = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9 && plus == 1)
				digits[i] = 0;
			else {
				digits[i] += plus;
				plus = 0;
			}
		}
		return digits;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 9 };
		System.out.println(new Solution().plusOne(a)[1]);
	}
}
