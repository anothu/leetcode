import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        LinkedList<Integer> list= new LinkedList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i], false);
        }
        for(int i=0;i<nums2.length;i++){
            if((new Boolean(false)).equals(map.get(nums2[i]))){
                list.add(nums2[i]);
                map.put(nums2[i], true);
            }
        }
        int result[]=new int[list.size()];
        int index=0;
        for(int i:list)
            result[index++]=i;
        return result;
    }
}
// @lc code=end

