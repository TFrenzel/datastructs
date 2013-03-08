public class LinkedList{
	private Node list;
	private Node current;
	private int size;
	
	public LinkedList(){
		list = null;
		size = 0;
	}
	
	public LinkedList(int n){
		list = new Node(n);
		current = list;
		size = 1;
		
	}
	
	public void insert(int i){
		Node n = new Node(i);
		insert(n);
	}
	
	private void insert(Node n){
		Node node = list;
		while(node.next != null){
			node = node.next;
		}
		node.next = n;
		size++;
	}
	
	
	public boolean isEmpty(){
		return length() == 0;
	}
	
	public void delete(int i){
		Node n = new Node(i);
		delete(n);
	}
	
	private void delete(Node n){
		Node node = list;
		if(n.data == node.data) { //This deletes first node
			list = list.next;
		}else{
			while(node.next.data != n.data){ //Run through looking for node
				node = node.next;
			}
			node.next = node.next.next;
		}
		size--;
	}
	
	public int length(){
		return size;
	}
	
	
	
	public static void main(String [] args){
		LinkedList list = new LinkedList(10);
		System.out.println(list.length());
		list.insert(2);
		
		LinkedList newList = new LinkedList();
		System.out.println(newList.isEmpty());
		
	}
	
	private class Node{
		int data;
		Node next;

		public Node(){
			data = 0;
			next = null;
		}
		
		public Node(int i){
			data = i;
			next = null;
		}
		
	}
}