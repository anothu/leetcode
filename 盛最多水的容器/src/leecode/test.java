package leecode;

public class test {
	public static void main(String[] args) {

		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	public static int area(int left, int right, int height[]) {
		return Math.min(height[left], height[right]) * (right - left);
	}

	public static int maxArea(int height[]) {
		int left = 0;
		int right = height.length - 1;
		int s = area(left, right, height);
		while (left != right) {
			if (height[left] < height[right])
				left++;
			else
				right--;
			s = Math.max(s, area(left, right, height));
		}
		return s;
	}
}