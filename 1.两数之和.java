import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //利用hashmap实现O(n)的查找两数之和
            Integer temp = map.get(target-nums[i]);
            if(temp!=null){
                return new int[]{i,map.get(temp)};
            }else map.put(nums[i], i);
        }
        return null;
    }
}
// @lc code=end

