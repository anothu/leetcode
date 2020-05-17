import java.util.*;
/**18. 四数之和 双重循环+双指针*/
class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(nums==null||nums.length<=2)return list;
		Arrays.sort(nums);
		for(int i=0;i<=nums.length-4;i++){
			if(i>=1&&nums[i-1]==nums[i])continue;
			for(int j=i+1;j<=nums.length-3;j++){
				if(j>=i+2&&nums[j-1]==nums[j])continue;
				int aim = target - nums[i]-nums[j];
				int left=j+1;int right = nums.length-1;
				while(left<right){
					int temp=nums[left]+nums[right];
					if(temp<aim){
						left++;
						while(left<right&&nums[left-1]==nums[left]){
							left++;
						}
					}else if(temp>aim){
						right--;
						while(left<right&&nums[right+1]==nums[right]){
							right--;
						}
					}else{
						list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						left++;
						while(left<right&&nums[left-1]==nums[left]){
							left++;
						}
						right--;
						while(left<right&&nums[right+1]==nums[right]){
							right--;
						}
					}
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().fourSum(new int[]{1,0,-1,0,-2,2}, 0));
	}
}