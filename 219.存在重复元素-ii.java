import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer temp =map.get(nums[i]);
            if(temp!=null){
                if(i-temp<=k)
                    return true;             
            }
            map.put(nums[i], i);  
        }
        return false;
    }
}
// @lc code=end

