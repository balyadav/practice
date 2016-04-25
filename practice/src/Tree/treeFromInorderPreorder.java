package Tree;

import definitions.TreeNode;

class PreIndex{
	int index;
	
	public PreIndex(){
		this.index = 0;
	}
}

public class treeFromInorderPreorder {
	
	private static TreeNode makeTreeFromInAndPre(int[] in, int[] pre, PreIndex p, int inStart, int inEnd, int size) throws IllegalStateException{
		if (p.index > size || inStart > inEnd)
			return null;
		TreeNode root = new TreeNode(pre[p.index++]);
		if (inStart == inEnd)
			return root;
		else{
			int idx = search(in, inStart, inEnd, root.data);
			if (idx != -1){
				root.left = makeTreeFromInAndPre(in, pre, p, inStart, idx-1, size);
				root.right = makeTreeFromInAndPre(in, pre, p, idx+1, inEnd, size);
			}
			return root;
		}
	}
	
	private static int search(int[] in, int start, int end, int key){
		if (start <= end){
			for (int i = start; i <= end; i++){
				if (in[i] == key)
					return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] in = {4, 2, 5, 1, 6, 3};
		int[] pre = {1, 2, 4, 5, 3, 6};
		PreIndex p = new PreIndex();
		TreeNode root = makeTreeFromInAndPre(in, pre, p, 0, in.length-1, in.length-1);
		TreeNode.printInOrder(root);
		char A = 'A';
		//System.out.println((int)A);
	}

}
