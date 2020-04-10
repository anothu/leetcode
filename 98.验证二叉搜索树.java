/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node==null) return true;
        int val =node.val;
        if(lower!=null&&val<=lower) return false;
        if(upper!=null&&val>=upper) return false;

        if(!helper(node.right, val, higher)) return false;
        if(!helper(node.left, lower, val)) return false;
        return true;
    }
    public boolean isValidBST(TreeNode root) {      
        return helper(node, null, null);
    }
}
// @lc code=end
