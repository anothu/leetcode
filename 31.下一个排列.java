/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

//@lc code=start
import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return;
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    Arrays.sort(nums, i + 1, nums.length);
                    return;
                }
            }
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
class test{
    public static void main(String[] args) {
        int a[]={1,2};
        new Solution().nextPermutation(a);
        System.out.println(a);
        
    }
}
//@lc code=end



