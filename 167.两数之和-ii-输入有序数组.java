/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end = numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target)
                break;
            if(numbers[start]+numbers[end]<target)
                start++;
            else end--;
        }
        int result[]={start+1,end+1};
        return result;
    }
}
// @lc code=end

