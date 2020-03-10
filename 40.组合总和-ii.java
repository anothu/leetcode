import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public void find(int[] candidates,int target,LinkedList<Integer> temp,int start,List<List<Integer>>list){
        while(start<candidates.length){
            if(target-candidates[start]==0){
                LinkedList<Integer> l = new LinkedList<>(temp);
                l.add(candidates[start]);
                list.add(l);
                return;
            }
            if(target-candidates[start]<0)
                return;
            LinkedList<Integer> l = new LinkedList<Integer>(temp);
            l.add(candidates[start]);
            find(candidates, target-candidates[start], l, start+1, list);
            start++;
            while(start<candidates.length&&candidates[start-1]==candidates[start])
                start++;         
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        LinkedList<Integer> l = new LinkedList<Integer>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        find(candidates, target, l, 0, list);
        return list;
    }
}
// @lc code=end

