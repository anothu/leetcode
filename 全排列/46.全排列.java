import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    private void swap(int nums[],int l,int r){
        int temp= nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    private int[] copy(int a[]){
        int b[]=new int [a.length];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        return b;
    }
    private void backTrack(int depth,int[]nums,List l,List<List<Integer>>list){
        if(depth==nums.length)
            list.add(l);
        for(int i=depth;i<nums.length;i++){
            List temp = new LinkedList<Integer>(l);
            temp.add(nums[i]);
            int[] nTemp= copy(nums);
            swap(nTemp,i,depth);
            backTrack(depth+1, nTemp, temp, list);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l =new LinkedList<>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        backTrack(0, nums, l, list);
        return list;

    }
}
// @lc code=end

