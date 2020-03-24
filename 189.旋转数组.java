/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int m=k%length;
        if(length==0||length==1||m==0)
            return;
        int a[]=new int [m];
        for(int i=0;i<m;i++){
            a[i]=nums[length-m+i];
        }
        for(int i=length-1;i>=m;i--){
            nums[i]=nums[i-m];
        }
        for(int i=0;i<m;i++){
            nums[i]=a[i];
        }
    }

}
// @lc code=end

