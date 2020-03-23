import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
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
    void dfs(int nowDepth,TreeNode node,List<List<Integer>> list){
        list.get(nowDepth).add(node.val);
        if(node.left==null&&node.right==null)
            return;
        else if(nowDepth+2>list.size())
            list.add(new ArrayList<Integer>());   
        if(node.left!=null)
            dfs(nowDepth+1, node.left, list);
        if(node.right!=null)
            dfs(nowDepth+1, node.right, list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        list.add(new ArrayList<Integer>());
        dfs(0, root, list);
        return list;
    }
}
// @lc code=end

