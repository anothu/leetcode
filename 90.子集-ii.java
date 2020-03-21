import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    int index=-1;
    void backtrack(int start, int[] nums, List<List<Integer>> list, LinkedList<Integer> l) {
        if(start==nums.length)
            return;
        for(int i=start;i<nums.length;){
            l.add(nums[i]);
            LinkedList temp =new LinkedList<>(l);
            list.add(temp);
            backtrack(i+1, nums, list, temp);
            l.removeLast();
            do{i++;}while(i>=1&&i<nums.length&&nums[i-1]==nums[i]);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> l = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        list.add(l);
        backtrack(0, nums, list, l);
        return list;
    }
}
// @lc code=end
