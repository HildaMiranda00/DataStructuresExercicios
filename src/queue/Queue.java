package queue;

public class Queue {
	private Node front;
	private Node back;

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void enqueue(int element) {
		Node newNode = new Node(element);
		if (front == null) {
			front = newNode;
			back = newNode;
		} else {
			back.next = newNode;
			back = newNode;
		}
	}

	public int dequeue() {
		if (front == null) {
			System.out.println("Fila vazia");
		} else {
			int data = front.data;
			front = front.next;
			if (front == null) {
				back = null;
			}
		}
		return front.data;
	}

	public int peek() {
		if (front == null) {
			System.out.println("Fila vazia");
		}
		return front.data;
	}

	public int size() {
		int count = 0;
		Node current = front;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
}
