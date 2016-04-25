package Tree;

import definitions.Node;
import definitions.TreeNode;
import java.util.Queue;
import java.util.LinkedList;

class NodeRef{
	Node node;
}
public class CompleteTreeFromLinkedLIst {
	
	public static TreeNode makeTreeFromLL(Node head, NodeRef currentNodeinLL){
		if (head == null)
			return null;
		Queue<Node> q = new LinkedList<Node>();
		q.add(head);
		TreeNode root = new TreeNode(head.data);
		while(!q.isEmpty()){
			Node curr = q.poll();
			if (curr.next != null){
				q.add(curr.next);
				curr
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(12);
		head.next.next = new Node(15);
		head.next.next.next = new Node(25);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(36);
	}

}
