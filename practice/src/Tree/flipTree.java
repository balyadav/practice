package Tree;

import definitions.TreeNode;

public class flipTree {
	
	public static TreeNode flip(TreeNode root){
		if (root == null || TreeNode.isLeaf(root))
			return root;
		TreeNode newRoot = flip(root.left);
		root.left.left = root.right;
		root.left.right = root;
		root.left = null;
		root.right = null;
		return newRoot;
		
		
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(7);
		
		TreeNode.printInOrder(root);
		System.out.println (" ");
		//CurrentPositionToAttach curr = new CurrentPositionToAttach();
		
		TreeNode.printInOrder(flip(root));
		
	}

}
