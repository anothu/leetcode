import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        LinkedList<Integer> list =new LinkedList<>();
        for(int i:nums1){
            Integer j=map.get(i);
            if(j!=null){
                map.put(i, j+1);
            }else map.put(i,1);
        }
        for(int i:nums2){
            Integer j=map.get(i);
            if(j!=null&&j>0){
                map.put(i, j-1);
                list.add(i);
            }
        }
        int index=0;
        int a[]=new int[list.size()];
        for(int i:list){
            a[index++]=i;
        }
        return a;
    }
}
// @lc code=end

