/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isTrue=true;
        if(p!=null&&q!=null&&p.val==q.val){
            if(!isSameTree(p.left, q.left))
                return false ;
            if(!isSameTree(p.right, q.right))
                return false;
        }else if(p==null&&q==null){}
        else isTrue=false;
        return isTrue;
    }
}
// @lc code=end

