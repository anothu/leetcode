/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */
//从尾到头
// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex=m-1;
        int nIndex=n-1;
        int index=m+n-1;
        while(index>=0){
            if(mIndex>=0&&nIndex>=0){
                if(nums1[mIndex]>nums2[nIndex]){
                    nums1[index--]=nums1[mIndex];
                    mIndex--;
                }else {
                    nums1[index--]=nums2[nIndex];
                    nIndex--;
                }
            }else if(mIndex>=0){
                nums1[index--] = nums1[mIndex--];
            }else
                nums1[index--] = nums2[nIndex--];
        }
    }
}
// @lc code=end

