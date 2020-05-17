import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

class Solution{
    public int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return 1;
        int left=0;
        int right=1;
        while(right!=nums.length){
            if(nums[left]==nums[right]){
                right++;
                continue;
            }
            nums[++left]=nums[right++];
        }
       // System.out.println(Arrays.asList(nums));
        return left+1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}