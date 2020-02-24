package leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int[] a = { -2, -3, 0, 0, -2 };
		System.out.println(sov(a));
	}

	public static List<List<Integer>> sov(int[] nums) {
		List<List<Integer>> returnList = new LinkedList<List<Integer>>();
		if (nums.length < 3)
			return returnList;
		Arrays.sort(nums);
		if (nums[0] > 0)
			return returnList;
		else if (nums[0] == 0) {
			if (nums[1] == 0 && nums[2] == 0)
				returnList.add(Arrays.asList(0, 0, 0));
			return returnList;
		}

		for (int i = 0; i <= nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int l = i + 1, r = nums.length - 1, temp;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {
					returnList.add(Arrays.asList(nums[i], nums[l], nums[r]));
					temp = nums[r];
					while (nums[r] == temp && l < r)
						r--;
					temp = nums[l];
					while (nums[l] == temp && l < r)
						l++;
					continue;
				} else if (sum > 0) {
					temp = nums[r];
					while (nums[r] == temp && l < r)
						r--;
					continue;
				} else {
					temp = nums[l];
					while (nums[l] == temp && l < r)
						l++;
					continue;
				}
			}

		}
		return returnList;
	}

}