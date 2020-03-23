/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int find(int[] nums,int left,int right) {
        // int left=0;
        // int right =nums.length-1;
        int mid=(left+right)/2; ;
        if(left<right){
            int leftMin,rightMin;
            //if the left is sorted    
            if(nums[left]<=nums[mid]){
                leftMin=nums[left];
                rightMin=find(nums, mid+1, right);
            }else {
                leftMin=find(nums, left, mid);
                rightMin=nums[mid+1];
            }
            return Math.min(leftMin, rightMin);
        }
        return nums[mid];
    }
    public int findMin(int[] nums) {
        return find(nums, 0, nums.length-1);
    }
}
// @lc code=end

