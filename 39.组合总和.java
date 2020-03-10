import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public void find(int [] candidates,int target,LinkedList<Integer> temp,int i,List<List<Integer>>list){
        if(target==0){
            LinkedList l =new LinkedList<Integer>(temp);
            list.add(l);
            return;
        }
        for(;i<candidates.length;i++){
            if(target-candidates[i]<0)
                return;
            else{
                LinkedList<Integer> l =new LinkedList<Integer>(temp);
                l.add(candidates[i]);
                find(candidates, target-candidates[i], l,i,list);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        LinkedList<Integer> temp =new LinkedList<Integer>();
        find(candidates, target, temp, 0, list);
        return list;
    }
}
// @lc code=end
