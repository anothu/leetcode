/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==0)
            return false;
        Arrays.sort(nums);
        int left =0;
        int right =nums.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]<target)
                left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}
// @lc code=end

