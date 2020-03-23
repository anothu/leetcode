/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        for(int i=0;i<nums.length;i++){
            if((i==0&&nums[1]<nums[0]))
                return i;
            else if(i==nums.length-1&&nums[nums.length-1]>nums[nums.length-2])
                return i;  
            else if(i>0&&i<nums.length-1&&nums[i]>nums[i-1]&&nums[i]>nums[i+1])
                return i;
        }
        return nums[nums.length-1];
    }
}
// @lc code=end

