/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
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
    final boolean IN_LEFT =true;
    boolean find(TreeNode root,TreeNode p){
        if(root==null)
            return false;
        if(root.val==p.val)
            return true;
        return find(root.left,p)||find(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val==p.val||root.val==q.val)
            return root;
        boolean p_in_left = find(root.left, p);
        boolean p_in_right = find(root.right, p);
        boolean q_in_left = find(root.left, q);
        boolean q_in_right = find(root.right, q);
        if(p_in_left&&q_in_right)
            return root;
        if(p_in_right&&q_in_left)
            return root;
        if(p_in_left&&q_in_left)
            return lowestCommonAncestor(root.left, p, q);
        else return lowestCommonAncestor(root.right, p, q);
        
    }
}
// @lc code=end

