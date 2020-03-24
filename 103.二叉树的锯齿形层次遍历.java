import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
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
    void dfs(int depth,List<List<Integer>> list,TreeNode node){
        if(depth==list.size()){
            list.add(new LinkedList<Integer>());
        }
        if(depth%2==1){
            list.get(depth).add(0,node.val);
        }else list.get(depth).add(node.val);
        if(node.left==null&&node.right==null)
            return;
        if(node.left!=null)
            dfs(depth+1, list, node.left);
        if(node.right!=null)
            dfs(depth+1, list, node.right);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        dfs(0, list, root);
        return list;        
    }
}
// @lc code=end

