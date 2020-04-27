/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while (left<=right) {
            long mid = left +(right-left)/2;
            long temp=mid*mid;
            if(temp==num)
                return true;
            else if(temp>num){
                right=mid-1;
            }else left=mid+1;
        }
        return false;
    }
}
// @lc code=end
