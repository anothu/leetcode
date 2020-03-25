/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    int count=0;
    void findAround(int i,int j,char[][] board,int needChange[][]){
        needChange[i][j]=1;
        //up
        if(i-1>=0&&board[i-1][j]=='1'&&needChange[i-1][j]==0){
            needChange[i-1][j]=1;
            findAround(i-1, j, board, needChange);
        }
        if(i+1<=board.length-1&&board[i+1][j]=='1'&&needChange[i+1][j]==0){
            needChange[i+1][j]=1;
            findAround(i+1, j, board, needChange);
        }
        if(j-1>=0&&board[i][j-1]=='1'&&needChange[i][j-1]==0){
            needChange[i][j-1]=1;
            findAround(i, j-1, board, needChange);
        }
        if(j+1<=board[0].length-1&&board[i][j+1]=='1'&&needChange[i][j+1]==0){
            needChange[i][j+1]=1;
            findAround(i, j+1, board, needChange);
        }
    }
    void search(char[][] grid ,int [][] isIsland){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&isIsland[i][j]==0){
                    findAround(i, j, grid, isIsland);
                    count++;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        if(grid.length==0||grid[0].length==0)
            return 0;
        int [][]isIsland=new int [grid.length][grid[0].length];
        search(grid, isIsland);
        return count;
    }
}
// @lc code=end

