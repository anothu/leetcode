/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int min = prices[0];
        int dp[] = new int[prices.length];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            dp[i]=Math.max(dp[i-1], prices[i]-min);
        }
        return dp[prices.length-1];
    }
}
// @lc code=end

