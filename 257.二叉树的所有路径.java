import java.util.LinkedList;
import java.util.List;

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
// class Solution {
//     void find(List<String> list,TreeNode root,StringBuilder sb){
//         sb.append(root.val);
//         if(root.left==null&&root.right==null){
//             list.add(sb.toString());
//             return;
//         }
        
//         if(root.left!=null){  
//             sb.append("->");  
//             find(list,root.left,sb);
//             sb.delete(sb.length()-3,sb.length());
//         }
//         if(root.right!=null){
//             sb.append("->");
//             find(list, root.right, sb);
//             sb.delete(sb.length()-3,sb.length());
//         }

//     }
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> list = new LinkedList<>();
//         if(root==null)
//             return list;
//         StringBuilder sb = new StringBuilder();
//         find(list, root, sb);
//         return list;
//     }
// }
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        if (root == null)
            return paths;

        LinkedList<TreeNode> node_stack = new LinkedList();
        LinkedList<String> path_stack = new LinkedList();
        node_stack.add(root);
        path_stack.add(Integer.toString(root.val));
        TreeNode node;
        String path;
        while (!node_stack.isEmpty()) {
            node = node_stack.pollLast();
            path = path_stack.pollLast();
            if ((node.left == null) && (node.right == null))
                paths.add(path);
            if (node.left != null) {
                node_stack.add(node.left);
                path_stack.add(path + "->" + Integer.toString(node.left.val));
            }
            if (node.right != null) {
                node_stack.add(node.right);
                path_stack.add(path + "->" + Integer.toString(node.right.val));
            }
        }
        return paths;
    }
}
// @lc code=end

