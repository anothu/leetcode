import java.util.Arrays;
/**16. 最接近的三数之和idea：排序+双指针*/
class Solution {
    public static int abs(int a) {
		if (a < 0)
			a = -a;
		return a;
	}
    public int threeSumClosest(int[] nums, int target) {
		if(nums==null||nums.length<=2) return 0;
		Arrays.sort(nums);
		int min= Integer.MAX_VALUE;
		int result=-1;
		for(int i=0;i<nums.length-2;i++){
			int left = i+1;
			int right = nums.length-1;
			while(left<right){
				int sum =nums[i]+nums[left]+nums[right];
				int temp = sum-target ;
				if(temp==0)return target;
				if(abs(temp)<min){
					min = abs(temp);
					result = sum;
				}
				if(temp<0){
					left++;
					while(left<right&&nums[left]==nums[left-1]){
						left++;
					}
				}else{
					right--;		
					while(left<right&&nums[right]==nums[right+1]){
						right--;
					}
				}	
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().threeSumClosest(new int[]{0,2,1,-3}, 1));
	}
}
