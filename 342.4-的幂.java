/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        int i=num;
        for(i=num;i>1&&i%4==0;i/=4){}
        if(i==1)
            return true;
        return false;
    }
}
// @lc code=end

