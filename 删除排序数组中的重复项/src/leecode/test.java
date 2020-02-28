package leecode;

public class test {
	public static void main(String[] args) {
		int a[] = { 0 };
		System.out.println(sov(a));
	}

	public static int sov(int[] nums) {
		int index = 1;
		int i = -1;
		for (; index < nums.length;) {
			if (nums[index] > nums[index - 1]) {
				index++;
			} else {
				if (i == -1)
					i = index + 1;
				for (;; i++) {
					if (i == nums.length)
						return index;
					else if (nums[i] > nums[index - 1]) {
						nums[index] = nums[i];
						index++;
					}
				}
			}
		}
		return index;
	}

}