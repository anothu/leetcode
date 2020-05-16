import java.util.*;

/**三数之和：排序+双指针法（最低，最高）*/
class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list =new LinkedList<List<Integer>>();
		if(nums.length<=2||nums[0]>0) return list;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0||i==nums.length-2) break;
			if(i>=1&&nums[i]==nums[i-1]) continue;
			int left=i+1;int right = nums.length-1;
			while(left<right){
				int temp =nums[i]+nums[left]+nums[right];
				if(temp<0){
					left++;
					while(left<right&&nums[left-1]==nums[left]){
						left++;
					}
				}else if(temp>0){
					right--;
					while(left<right&&nums[right]==nums[right+1]){
						right--;
					}
				}else {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					while(left<right&&nums[left-1]==nums[left]){
						left++;
					}
					right--;
					while(left<right&&nums[right]==nums[right+1]){
						right--;
					}
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int nums[]={-1, 0, 1, 2, -1, -4};
		System.out.println(new Solution().threeSum(nums));
	}
}
