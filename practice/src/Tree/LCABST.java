package Tree;

import definitions.TreeNode;

public class LCABST {
	public static TreeNode LCAofBST(TreeNode BSTRoot, int small, int big){
		if (BSTRoot == null)
			return null;
		if (BSTRoot.data >= small && BSTRoot.data <= big)
			return BSTRoot;
		else if (BSTRoot.data < small)
			return LCAofBST(BSTRoot.left, small, big);
		else
			return LCAofBST(BSTRoot.right, small, big);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
