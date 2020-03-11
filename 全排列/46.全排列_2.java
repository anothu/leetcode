import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    private void swap(int nums[],int l,int r){
        int temp= nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    private List<Integer> tolist(int nums[]){
        LinkedList l = new LinkedList<Integer>();
        for(int i:nums)
            l.addLast(i);
        return l;
    }
    private void backTrack(int depth,int[]nums,List<List<Integer>>list){
        if(depth==nums.length)
            list.add(tolist(nums));
        for(int i=depth;i<nums.length;i++){
            swap(nums, i, depth);
            backTrack(depth+1, nums, list);
            swap(nums, i, depth);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        backTrack(0, nums, list);
        return list;

    }
}
// @lc code=end

