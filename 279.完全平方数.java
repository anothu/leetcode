/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        if (n < 4)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++){
            int min=dp[i-1]+1;
            for(int j=2;i-j*j>=0;j++){
                min=Math.min(min, dp[i-j*j]+1);
            }
            dp[i]=min;
        }
        return dp[n];

    }
}
// @lc code=end
