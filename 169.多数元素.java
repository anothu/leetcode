import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        HashMap<Integer,Integer> hSet =new HashMap<>();
        int temp=nums.length/2;
        for(int n:nums){
            if(!hSet.containsKey(n))
                hSet.put(n, 1);
            else if(hSet.get(n)+1>temp)
                return n;
            else hSet.put(n,hSet.get(n)+1);
        }
        return 0;
    }
}
// @lc code=end

