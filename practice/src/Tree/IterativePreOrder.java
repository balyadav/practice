package Tree;
import java.util.Stack;

import definitions.TreeNode;

public class IterativePreOrder {
	
	public static void iterativePreOrder(TreeNode root){
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode curr = s.pop();
			System.out.print(curr.data + " ");
			if (curr.right != null)
				s.push(curr.right);
			if (curr.left != null)
				s.push(curr.left);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		iterativePreOrder(root);
	}

}
