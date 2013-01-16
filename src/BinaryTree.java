public class BinaryTree {
	private Node root;
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(int newData){
			data = newData;
			left = null;
			right = null;
		}
	}
	
	public BinaryTree(){
		root = null;
	}
	
	public void insert(int data){
		root = insert(root, data);
	}
	
	public boolean lookup(int data){
		return (lookup(root, data));
	}
	
	
	private boolean lookup(Node node, int data){
		if(node == null){
			return false;
		}
		
		if (node.data == data){
			return true;
		}else if (node.data < data){
			return lookup(node.left, data);
		}else{
			return lookup(node.right,data);
		}
	
	}
	
	private Node insert(Node node, int data){
		if(node==null){
			node = new Node(data);
		}else if(data < node.data){
			node.left = insert(node.left, data);
		}else{
			node.right = insert(node.right, data);
		}
		return (node);
	}
	
	
	
}