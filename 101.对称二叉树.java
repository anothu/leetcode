/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public static boolean equal(TreeNode l,TreeNode r){
        if((l!=null&&r!=null)&&l.val==r.val){
            if(!equal(l.left, r.right))
                return false;
            if(!equal(l.right,r.left))
                return false;
        }else if(l==null&&r==null){}
        else return false;
        return true;

    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return equal(root.left, root.right);
        
    }
}
// @lc code=end

