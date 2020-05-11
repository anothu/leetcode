import Practice.TreeNode;

/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root ==null) return 0;
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        return sum(list, 0);
    }
    public int sum(LinkedList<TreeNode> list,int sum){
        LinkedList<TreeNode> temp =new LinkedList<>();
        for(TreeNode tn:list){
            if(tn.left!=null){
                if(tn.left.left==null&&tn.left.right==null){
                    sum+=tn.left.val;
                }
                else {
                    temp.add(tn.left);
                }              
            }
            if(tn.right!=null){
                temp.add(tn.right);
            }
        }
        if(temp.size()==0) return sum;
        return sum(temp,sum);
    }

}
// @lc code=end

