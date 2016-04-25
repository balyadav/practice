package Tree;

import definitions.TreeNode;

public class checkIsSumTree { 
	
	public static boolean isSumTree(TreeNode root){
		if (root == null || TreeNode.isLeaf(root))
			return true;
		if (isSumTree(root.left) && isSumTree(root.right)){
			int lval, rval;
			if (TreeNode.isLeaf(root.left))
				lval = root.left.data;
			else if (root.left == null)
				lval = 0;
			else
				lval = 2 * root.left.data;
		
			if (TreeNode.isLeaf(root.right))
				rval = root.right.data;
			else if (root.right == null)
				rval = 0;
			else
				rval = 2 * root.right.data;
			return (root.data == (lval+rval))? true:false;
			}
		return false;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(26);
		root.left = new TreeNode(10);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(6);
		root.right.right = new TreeNode(3);
		//System.out.println(isSumTree(root));
		
		TreeNode rootTwo = new TreeNode(29);
		rootTwo.left = new TreeNode(5);
		rootTwo.right = new TreeNode(12);
		rootTwo.right.right = new TreeNode(6);
		rootTwo.right.right.right = new TreeNode(3);
		rootTwo.right.right.right.right = new TreeNode(3);
		System.out.println(isSumTree(rootTwo));
	}

}
