/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean isBal = true;
    private static int abs(int a,int b){
        if(a-b>0)
            return a-b;
        return b-a;
    }
    public int findDepth(TreeNode root,int depth){
        if(root==null)
            return depth;
        int leftDepth=depth ;
        int rightDepth=depth;
        if(root.left!=null)
            leftDepth = findDepth(root.left, depth+1);
        if(root.right!=null)
            rightDepth = findDepth(root.right, depth+1);
        if(abs(leftDepth, rightDepth)>1)
            isBal=false;
        return Math.max(leftDepth, rightDepth);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        findDepth(root, 0);
        return isBal;
    }
}
// @lc code=end

