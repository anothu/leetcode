/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==0){
                dp[i][0]=1;
            }else break;
        }
        for(int i=0;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==0){
                dp[0][i]=1;
            }else break;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1) continue;
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
// @lc code=end

