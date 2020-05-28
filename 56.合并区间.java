import java.util.HashMap;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        int left = intervals[0][0];
        int right = intervals[0][1];
        LinkedList<Integer> list = new LinkedList<>();
       for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=right&&intervals[i][1]>=left){
                left = Math.min(left, intervals[i][0]);
                right = Math.max(right, intervals[i][1]);
            }else {
                list.add(left);
                list.add(right);
                left = intervals[i][0];
                right = intervals[i][1];
            }
       }
       list.add(left);
       list.add(right);
       int [][]result = new int[list.size()/2][2];
       int i=0;int j=0;
       for(Integer inte: list){
            result[i][j] = inte;
            if(j==0){
                j++;
            }else{
                j--;
                i++;
            }
       }
       return result;
    }
}
// @lc code=end

