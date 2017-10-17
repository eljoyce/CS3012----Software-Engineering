

public class BST <Key extends Comparable<Key>>{
	
	//Private class representing Nodes in a BST
	private class Node{
		Node left, right;
		Key key;
		
		public Node(Key key){
			this.key = key;
		}
	}
	
	//Root node (node with no parent node)
	private Node root;
	
	//
	public BST(){
		
	}
}
