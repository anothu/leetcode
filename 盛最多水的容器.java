/**
 * 11. 盛最多水的容器:双指针法，总是移动两个指针中较小的指针
*/
class Solution {
	public static int area(int left, int right, int height[]) {
		return Math.min(height[left], height[right]) * (right-left);
	}

	public int maxArea(int height[]) {
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