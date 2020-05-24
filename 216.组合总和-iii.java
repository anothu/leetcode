import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    private Deque<Integer> stack = new LinkedList<Integer>();
    private List<List<Integer>> list = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, 1);
        return list;
    }
    public void dfs(int k,int n,int start){
        if(n==0&&k==0){
            list.add(new LinkedList<Integer>(stack));
        } 
        for(int i=start;i<10;i++){
            if(k>10-start) return;
            stack.push(i);
            dfs(k-1, n-i, i+1);
            stack.pop();
        }
    }
}
// @lc code=end

