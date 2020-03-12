import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private TreeNode repeat(int left, int right, int[] nums) {        
        if(left>right)
            return null;
        if(left==right)
            return new TreeNode(nums[left]);
        int mid = (left + right) / 2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = repeat(left, mid - 1, nums);
        temp.right = repeat(mid + 1, right, nums); 
        return temp;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return repeat(0, nums.length-1, nums);
    }
}
// @lc code=end
