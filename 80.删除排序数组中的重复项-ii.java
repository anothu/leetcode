/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3)return nums.length;
        int left =0;int right=1;int index=0;
        while(true){
            if(right==nums.length){
                int length = right-left;
                int l=length>=3?2:length;
                int t = nums[left];
                for(int i=0;i<l;i++){
                    nums[index++]=t;
                }
                return index; 
            }
            while(nums[left]==nums[right]){
                right++;
                if(right==nums.length){
                    int length = right-left;
                    int l=length>=3?2:length;
                    int t = nums[left];
                    for(int i=0;i<l;i++){
                        nums[index++]=t;
                    }
                    return index; 
                }
            }
            int length = right-left;
            int l=length>=3?2:length;
            int t = nums[left];
            for(int i=0;i<l;i++){
                nums[index++]=t;
            }
            left=right;
            right++;
        }
    }
}
// @lc code=end

