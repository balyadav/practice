package definitions;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public int data;

	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public static void printInOrder(TreeNode root){
		if (root == null)
			return;
		printInOrder(root.left);
		System.out.print(root.data + " ");
		printInOrder(root.right);
	}
	
	public static boolean isLeaf(TreeNode root){
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return true;
		else
			return false;
	}
}
