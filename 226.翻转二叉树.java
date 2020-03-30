import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    void change(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null || root.right != null) {
            TreeNode temp = root.left;
            root.left=root.right;
            root.right=temp;
            change(root.left);
            change(root.right);
        }
    }

    public TreeNode invertTree(TreeNode root) {
        change(root);
        return root;
    }
}
// @lc code=end
