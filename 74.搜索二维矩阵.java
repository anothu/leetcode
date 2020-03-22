/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public int[]  findx(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(matrix[mid][0]<=target&&target<=matrix[mid][matrix[0].length-1])
                return matrix[mid];
            else if(target<matrix[mid][0])
                right=mid-1;
            else left=mid+1;
        }
        return matrix[0];
    }
    public boolean findy(int []a,int target){
        int left=0;
        int right =a.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(a[mid]==target)
                return true;
            else if(a[mid]<target)
                left=mid+1;
            else right=mid-1;  
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        return findy(findx(matrix, target), target);
    }
}
// @lc code=end

