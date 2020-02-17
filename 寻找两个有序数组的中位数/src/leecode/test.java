package leecode;

public class test {
	public static void main(String[] args) {

	}

	public static double solution(int nums1[], int nums2[]) {
		int right1 = nums1.length / 2;
		int left1 = right1 - 1;
		int right2 = (nums2.length + 1) / 2;
		int left2 = right2 - 1;
		while (true) {
			if (nums2[left2] > nums1[right1]) {
				right2--;
				left2--;
				right1++;
				left1++;
			} else if (nums1[left1] > nums2[right2]) {
				right2++;
				left2++;
				right1--;
				left1--;
			} else {
				if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
					return (Math.max(nums1[left1], nums2[left2]) + Math.min(nums1[right1], nums2[right2])) / 2.0;
				} else if (nums1.length % 2 == 1 && nums2.length % 2 == 1) {
					return (Math.max(nums1[left1], nums2[left2]) + Math.min(nums1[right1], nums2[right2])) / 2.0;
				} else if (nums1.length % 2 == 1 && nums2.length % 2 == 0) {
					return Math.min(nums1[right1], nums2[right2]);
				} else {
					return Math.max(nums1[left1], nums2[left2]);
				}
			}

		}
	}
}
