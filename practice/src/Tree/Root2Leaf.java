package Tree;

import definitions.TreeNode;

public class Root2Leaf {
	
	public static void printRoot2Leaf(TreeNode root){
		int size = 100;
		int[] PATH = new int[size];
		printRoot2Leaf(root, PATH, 0);
	}
	
	public static void printRoot2Leaf(TreeNode root, int[] path, int pathIndex){
		if (root == null)
			return;
		path[pathIndex++] = root.data;
		if (TreeNode.isLeaf(root))
			printPath(path, pathIndex);
		printRoot2Leaf(root.left, path, pathIndex);
		printRoot2Leaf(root.right, path, pathIndex);
	}
	
	public static void printPath(int[] path, int pathIndex){
		for(int i = 0; i <pathIndex; i++){
			System.out.print(path[i]);
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(7);
		
		printRoot2Leaf(root);

	}

}
