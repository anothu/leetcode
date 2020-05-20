import java.util.LinkedList;

class Solution {
    public void add(List<Integer> list, TreeNode node){
        if(node==null){
            return;
        }
        list.add(node.val);
        add(list, node.left);
        add(list,node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =new LinkedList<Integer>();
        add(list,root);
        return list;
    }
}