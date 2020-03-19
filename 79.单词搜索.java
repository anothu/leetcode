/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    private boolean isvisited[][];
    boolean backtrack(int i,int j,int depth,String word,char[][] board,boolean[][] isvisited){
        if(depth==word.length())
            return true;
        char c = word.charAt(depth);
        //up
        if(i-1>=0&&!isvisited[i-1][j]&&board[i-1][j]==c){
            isvisited[i-1][j]=true;
            if(backtrack(i-1, j, depth+1, word, board, isvisited))
                return true;
            isvisited[i-1][j]=false;   
        }
        //down
        if(i+1<board.length&&!isvisited[i+1][j]&&board[i+1][j]==c){
            isvisited[i+1][j]=true;
            if(backtrack(i+1, j, depth+1, word, board, isvisited))
                return true;
            isvisited[i+1][j]=false;   
        }
        //left
        if(j-1>=0&&!isvisited[i][j-1]&&board[i][j-1]==c){
            isvisited[i][j-1]=true;
            if(backtrack(i, j-1, depth+1, word, board, isvisited))
                return true;
            isvisited[i][j-1]=false;   
        }
        //right
        if(j+1<board[0].length&&!isvisited[i][j+1]&&board[i][j+1]==c){
            isvisited[i][j+1]=true;
            if(backtrack(i, j+1, depth+1, word, board, isvisited))
                return true;
            isvisited[i][j+1]=false;   
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        char c = word.charAt(0);
        isvisited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                isvisited[i][j]=false;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==c){
                    isvisited[i][j]=true;
                    if(backtrack(i,j,1,word,board,isvisited))
                        return true;
                    isvisited[i][j]=false;
                }
            }
        }
        return false;
    }
}
// @lc code=end

