package Tree;
import java.util.Stack;

import definitions.TreeNode;
public class IterativePostOrderUsing2Stacks {
	
	private static void iterativePostOrder(TreeNode root){
		if (root == null)
			return;
		Stack<TreeNode> one = new Stack<TreeNode>();
		Stack<TreeNode> two = new Stack<TreeNode>();
		
		one.push(root);
		while(!one.isEmpty()){
			TreeNode curr = one.pop();
			if (curr.left != null)
				one.push(curr.left);
			if (curr.right != null)
				one.push(curr.right);
			two.push(curr);
		}
		while(!two.isEmpty())
			System.out.print(two.pop().data + " ");
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		iterativePostOrder(root);
		
	}

}
