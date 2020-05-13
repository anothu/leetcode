/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i=31;i>=0;i--){
            int temp = ((n&1)<<i);
            result+=temp;
            n=n>>>1;
            
        }
        return result;
    }
}
// @lc code=end
