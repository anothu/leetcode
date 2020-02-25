package leecode;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int a[] = { 10, 10, 29, 9 };

		System.out.println(sov(a, 30));
	}

	public static int abs(int a) {
		if (a < 0)
			a = -a;
		return a;
	}

	public static int sov(int[] nums, int target) {
		Arrays.sort(nums);
		int l, r, sum, result = Integer.MAX_VALUE / 2;
		for (int i = 0; i <= nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			l = i + 1;
			r = nums.length - 1;
			while (l < r) {
				sum = nums[i] + nums[l] + nums[r];
				if (sum == target)
					return target;
				else if (sum < target) {
					if (abs(sum - target) < abs(result - target))
						result = sum;
					l++;
					continue;
				} else {
					if (abs(sum - target) < abs(result - target))
						result = sum;
					r--;
					continue;
				}
			}
		}
		return result;
	}

}