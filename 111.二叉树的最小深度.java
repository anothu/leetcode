/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int findMin(int depth,TreeNode node) {
        if(node.left==null&&node.right==null)
            return depth;
        if(node.left!=null&&node.right==null)
            return findMin(depth+1, node.left);
        if(node.right!=null&&node.left==null)
            return findMin(depth+1, node.right);
        return (Math.min(findMin(depth+1, node.left),findMin(depth+1, node.right)));
    }
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        return findMin(1, root);
    }
}
// @lc code=end

