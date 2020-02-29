package leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int a[] = { 1, 0, -1, 0, -2, 2 };
		System.out.println(sov(a, 0));
	}

	public static List<List<Integer>> sov(int[] nums, int target) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if (nums.length < 4)
			return list;
		Arrays.sort(nums);
		int left, right;
		for (int i = 0; i <= nums.length - 4; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j <= nums.length - 3; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				left = j + 1;
				right = nums.length - 1;
				while (left < right) {
					if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
						list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;
						while (left < right && nums[left - 1] == nums[left])
							left++;
						while (left < right && nums[left - 1] == nums[left])
							right--;

					} else if (nums[i] + nums[j] + nums[left] + nums[right] > target) {
						right--;
						while (left < right && nums[right + 1] == nums[right])
							right--;
					} else {
						left++;
						while (left < right && nums[left - 1] == nums[left])
							left++;
					}
				}
			}
		}
		return list;

	}

}