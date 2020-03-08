/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int find(int []nums,int target,int left,int right){

        int mid= (left+right)/2;
        if(nums[mid]==target)
            return mid;
        else if(left==right)
            return -1;
        else if(nums[mid]>target)
            return find(nums, target, left, mid);
        else return find(nums, target, mid+1, right);
        
    }
    public int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        if(nums.length==0)
            return result;
        if(nums.length==1&&nums[0]==target){
            result[0]=0;
            result[1]=0;
            return result;
        }
        int begin=find(nums, target, 0, nums.length-1);
        int end=begin;
        while(begin-1>=0&&nums[begin-1]==nums[begin])
            begin--;
        while(end>=0&&end+1<=nums.length-1&&nums[end+1]==nums[end])
            end++;
        result[0]=begin;
        result[1]=end;
        return result;
    }
}
// @lc code=end

