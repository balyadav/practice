package Tree;

import definitions.TreeNode;

public class Convert2ChildrenSum {
	
	public static void convert2ChildrenSum(TreeNode root){
		if (root == null)
			return ;
		convert2ChildrenSum(root.left);
		convert2ChildrenSum(root.right);
		
		int lval = (root.left == null)? 0:root.left.data;
		int rval = (root.right == null) ? 0:root.right.data;
		
		int diff = (lval + rval - root.data);
		if (diff > 0)
			root.data += diff;
		else{
			propagateDiff(root, -diff);
		}
	}
	
	public static void propagateDiff(TreeNode root, int data){
		if (root == null)
			return;
		else if(root.left != null){
			root.left.data += data;
			propagateDiff(root.left, data);
		}
		else if(root.right != null){
			root.right.data += data;
			propagateDiff(root.right, data);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(7);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(30);
		
		TreeNode.printInOrder(root);
		convert2ChildrenSum(root);
		System.out.print("\n");
		TreeNode.printInOrder(root);
		
	}

}
