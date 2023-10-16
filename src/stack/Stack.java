package stack;

public class Stack {

	private Node top;
	private int size;
	
	public void push(int element) {
		if(top == null) {
			Node newNode = new Node(element);
			top = newNode;
		} else {
	Node newNode = new Node(element);
	newNode.next = top;
	top= newNode;
		}
	this.size++;
	}
	
	public int pop(){
		if (top == null) {
			System.out.println("Pilha vazia");
			return -1;
		} else {
			int element = top.data;
			top = top.next;
			this.size--;
			return element;
		
		}
		
	}
	public int peek() {
		if (top == null) {
			System.out.println("Pilha vazia");
			return -1;
		}
		return top.data;
	}
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	
}
