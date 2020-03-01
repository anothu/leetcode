package leecode;

public class test {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(a, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i : nums)
			if (i != val)
				nums[index++] = i;
		return index;
	}
}