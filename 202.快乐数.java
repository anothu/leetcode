/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    int loop(int n){
        int result=0;
        while(n>0){
            int temp=n%10;
            result+=temp*temp;
            n/=10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=loop(slow);
            fast=loop(fast);
            fast=loop(fast);
        }while(fast!=slow);
        if(slow==1)
            return true;
        return false;
    }
}
// @lc code=end

