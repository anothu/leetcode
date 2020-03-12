import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private void find(int depth, TreeNode node, List<List<Integer>> list) {
        if (node == null)
            return;
        if (depth == list.size()) {
            list.add(new LinkedList<Integer>());
            list.get(depth).add(node.val);
        }else
            list.get(depth).add(node.val);
        find(depth + 1, node.left, list);
        find(depth + 1, node.right, list);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        find(0, root, list);
        Collections.reverse(list);
        return list;
    }
}
// @lc code=end
