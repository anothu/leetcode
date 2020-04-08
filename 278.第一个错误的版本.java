/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int isAllRight(int left,int right){
        int mid=left+(right-left)/2;
        if(!isBadVersion(mid))
            return isAllRight(mid+1, right);
        else if(mid!=1&&isBadVersion(mid-1))
            return isAllRight(left,mid-1);
        else return mid;
    }
    public int firstBadVersion(int n) {
        return isAllRight(1, n);        
    }
}
// @lc code=end

