/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second=2;
        if(n==1)
            return first;
        if(n==2)
            return second;
        for(int i=3;i<=n;i++){
            int temp=second;
            second=first+second;
            first=temp;
        }
        return second;
    }
}

// @lc code=end

