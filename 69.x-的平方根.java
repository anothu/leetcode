/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x < 4){
            return 1;
        }
        long res = binatrySerach(1,(long)x,x);
        return (int)res;
    }
    public static long binatrySerach(long left,long right,int n){
        while(left <= right){
            long mid = (left+right)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid > n && (mid-1)*(mid-1) < n){
                return mid-1;
            }else if(mid*mid > n){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return 0;
    }
}
// @lc code=end
