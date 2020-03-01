package leecode;

public class test {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 2, 3, 0, 4, 2 };

	}

	public int searchInsert(int[] nums, int target) {
		if (target > nums[nums.length - 1])
			return nums.length;
		else if (target <= nums[0])
			return 0;
		else {
			for (int i = 1; i < nums.length; i++)
				if (nums[i] >= target)
					return i;
		}
		return 0;

	}
}