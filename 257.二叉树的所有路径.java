/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    void find(List<String> list,TreeNode root,StringBuilder sb){
        sb.append(root.val);
        if(root.left==null&&root.right==null){
            list.add(sb.toString());
            return;
        }
        if(root.left!=null){
            StringBuilder temp =new StringBuilder();
            temp.append(sb);
            temp.append("->");
            find(list,root.left,temp);
        }
        if(root.right!=null){
            StringBuilder temp =new StringBuilder();
            temp.append(sb);
            temp.append("->");
            find(list,root.right,temp);
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if(root==null)
            return list;
        StringBuilder sb = new StringBuilder();
        find(list, root, sb);
        return list;
    }
}

// @lc code=end

