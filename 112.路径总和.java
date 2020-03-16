/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    boolean backtrack(int target,int sum,TreeNode node){
        if(node!=null){
            if(node.left==null&&node.right==null){
                if(sum+node.val==target)
                    return true;
                else return false;
            }
            boolean a=backtrack(target, sum+node.val, node.left);
            boolean b =backtrack(target, sum+node.val, node.right);
            if(!a&&!b)
                return false;
            else return true;
        }
        return false;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        return backtrack(sum, 0, root);
    }
}
// @lc code=end

