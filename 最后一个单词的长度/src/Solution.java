
class Solution {
	public int lengthOfLastWord(String s) {
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (count == 0 && s.charAt(i) == ' ')
				continue;
			else if (s.charAt(i) != ' ')
				count++;
			else
				break;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLastWord(""));
	}
}
