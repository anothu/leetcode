/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
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
        int i=0;
        while(i<nums.length-1)
            if(nums[i]==nums[i+1])
                i++;
            else break;
        int j=nums.length-1;
        while(j>=1)
            if(nums[j]==nums[j-1])
                j--;
            else break;
        return find(nums, i, j);
    }
}
// @lc code=end

