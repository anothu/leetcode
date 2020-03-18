import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    private void backtrack(int start,LinkedList<Integer>l,List<List<Integer>> list,int nums[]){
        if(start==nums.length)
            return;
        for(int i=start;i<nums.length;i++){
            l.add(nums[i]);
            LinkedList temp =new LinkedList<>(l);
            list.add(temp);
            backtrack(i+1, l, list, nums);
            l.removeLast();
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> l = new LinkedList<Integer>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        list.add(l);
        backtrack(0,l,list,nums);
        return list;
    }
}
// @lc code=end

