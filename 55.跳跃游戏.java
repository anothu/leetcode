/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] canArrive = new boolean[nums.length];
        canArrive[nums.length-1] = true;
        for(int i=nums.length-2;i>=0;i--){
            for(int j=1;j<=nums[i];j++){
                int index =j+i;
                if(index<nums.length&&canArrive[index]){
                    canArrive[i]=true;
                    break;
                }
            }
        }
        return canArrive[0];
    }
}
// @lc code=end

