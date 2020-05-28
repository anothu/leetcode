/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    private final int RIGHT = 1;
    private final int DOWN = 2;
    private final int LEFT = 3;
    private final int UP = 4;
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        boolean[][] isUsed = new boolean[n][n];
        int x =0;int y=0;
        int flag =RIGHT;
        int index =2;
        result[0][0] =1;
        isUsed[0][0]=true;
        while(index<=n*n){
            if(flag==RIGHT){
                if(y+1>=n||isUsed[x][y+1]){
                    flag=DOWN;
                    continue;
                }else{
                    result[x][++y] = index++;
                    isUsed[x][y]=true;
                }
            }else if(flag == DOWN){
                if(x+1>=n||isUsed[x+1][y]){
                    flag=LEFT;
                    continue;
                }else {
                    result[++x][y]=index++;
                    isUsed[x][y]=true;
                }
            }else if(flag==LEFT){
                if(y-1<0||isUsed[x][y-1]){
                    flag=UP;
                    continue;
                }else{
                    result[x][--y]=index++;
                    isUsed[x][y]=true;
                }
            }else if(flag==UP){
                if(x-1<0||isUsed[x-1][y]){
                    flag=RIGHT;
                    continue;
                }else{
                    result[--x][y]=index++;
                    isUsed[x][y]=true;
                }
            }
        }
        return result;
    }
}
// @lc code=end
