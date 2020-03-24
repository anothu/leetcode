/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 */

// @lc code=start
class Solution {
    void findAround(int i,int j,char[][] board,int needChange[][]){
        //up
        if(i-1>=0&&board[i-1][j]=='O'&&needChange[i-1][j]==0){
            needChange[i-1][j]=1;
            findAround(i-1, j, board, needChange);
        }
        if(i+1<=board.length-1&&board[i+1][j]=='O'&&needChange[i+1][j]==0){
            needChange[i+1][j]=1;
            findAround(i+1, j, board, needChange);
        }
        if(j-1>=0&&board[i][j-1]=='O'&&needChange[i][j-1]==0){
            needChange[i][j-1]=1;
            findAround(i, j-1, board, needChange);
        }
        if(j+1<=board[0].length-1&&board[i][j+1]=='O'&&needChange[i][j+1]==0){
            needChange[i][j+1]=1;
            findAround(i, j+1, board, needChange);
        }
    }
    void findChange(char[][] board,int needChange[][]) {
        for(int i=0;i<board.length;i+=board.length-1){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&needChange[i][j]==0){
                    needChange[i][j]=1;
                    findAround(i,j,board,needChange);
                }
            }
        }
        for(int j=0;j<board[0].length;j+=board[0].length-1){
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='O'&&needChange[i][j]==0){
                    needChange[i][j]=1;
                    findAround(i,j,board,needChange);
                }
            }
        }
    }

    public void solve(char[][] board) {
        if(board.length<=2||board[0].length<=2)
            return;
        int needChange[][] = new int[board.length][board[0].length];
        findChange(board, needChange);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(needChange[i][j]==0&&board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
}
// @lc code=end
