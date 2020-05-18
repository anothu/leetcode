/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] >= nums[1] ? nums[0] : nums[1];
        }
        int first = nums[0];
        for (int i : nums) {
            first = first >= i ? first : i;
        }
        int second = 0;
        boolean init1 = false;
        for (int i : nums) {
            if (i < first) {
                if (!init1) {
                    init1 = true;
                    second = i;
                }else{
                    second = second >= i ? second : i;
                }
            }
        }
        if (!init1) {
            return nums[0];
        }
        int third = 0;
        boolean init2 = false;
        for (int i : nums) {
            if (i < second) {
                if (!init2) {
                    init2 = true;
                    third = i;
                }else{
                    third = third >= i ? third : i;
                }
            }
        }
        if (init2) {
            return third;
        } else {
            return first;
        }
    }
}
// @lc code=end

