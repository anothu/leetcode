/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N皇后
 */

// @lc code=start
class Solution {
    private void traceback(List<List<String>> list,int n,char[][]a,int row){
        if(row==n){
            List<String> l = new LinkedList<String>();
            for(int i=0;i<n;i++){
                StringBuilder s = new StringBuilder();
                for(int j=0;j<n;j++)
                    s.append(a[i][j]);
                l.add(s.toString());
            }
            list.add(l);
        }
        for(int col=0;col<n;col++){
            if(isConfirmed(n, a, row, col)){
                a[row][col]='Q';
                traceback(list, n, a, row+1);
                a[row][col]='.';
            }
        }

    }
    private boolean isConfirmed(int n,char[][]a,int row,int col){
        int i,j;
        for(i=0;i<row;i++){
            if(a[i][col]=='Q')
                return false;
        }
        for(i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(a[i][j]=='Q')
                return false;
        }
        for(i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(a[i][j]=='Q')
                return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char a[][]= new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]='.';
        List<List<String>> list = new LinkedList<List<String>>();
        traceback(list, n, a, 0);
        return list;
    }
}
// @lc code=end

