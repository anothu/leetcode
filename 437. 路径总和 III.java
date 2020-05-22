class Solution {
	private int result=0;
    public int pathSum(TreeNode root, int sum) {
		if(root==null) return 0;
		//判断以该节点为起点一共有多少条路径
		Sum(root,sum);
		//判断以该节点的左右孩子为起点的路径
		pathSum(root.left, sum);
		pathSum(root.right, sum);
	}
	
	public void Sum(TreeNode root,int sum){
		//如果该节点为空，退出
		if(root==null) return ;
		//改变sum
		sum-=root.val;
		//假如此时符合条件，结果总数加1
		if(sum==0){
			result++;
		}
		//再判断左右孩子节点
		Sum(root.left, sum);
		Sum(root.right,sum);
	}
}