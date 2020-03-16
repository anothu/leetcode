import java.util.*;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    void trackback(int count,List<List<Integer>>list,LinkedList temp,int start,int k,int n){
        if(count==k){
            LinkedList l = new LinkedList<>(temp);
            list.add(l);
            return;
        }
        for(int i=start;i<=n-k+count+1;i++){
            temp.add(i);
            trackback(count+1, list, temp, i+1, k, n);
            temp.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        trackback(0, list, temp, 1, k, n);
        return list;
    }
}
// @lc code=end

