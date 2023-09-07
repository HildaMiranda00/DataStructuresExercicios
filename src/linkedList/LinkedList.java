package linkedList;
import arrayList.List;
import tetse.Node;

public class LinkedList implements List{
	private Node head;
	private Node tail;
	private int size;
	int value;

	public Object get(int index) {
		if (index < this.size) {
			Node currentNode = this.head;
			for(int i = 0; i <= index; i++) {
				if(i == index) {
					return currentNode.getData();
				}
				currentNode = currentNode.getNext();

			}
			
		}
		throw new IllegalArgumentException("IndexOutOfBounds");
	}
	

	public void add(Object element, int index) {
	    if (index >= 0 && index <= this.size) {
	        if (index == 0) {
	            Node newNode = new Node(element);
	            newNode.setNext(this.head);
	            this.head = newNode;
	            if (this.size == 0) {
	                this.tail = newNode;
	            }
	        } else {
	            Node currentNode = this.head;
	            for (int i = 0; i < index - 1; i++) {
	                currentNode = currentNode.getNext();
	            }
	            Node newNode = new Node(element);
	            newNode.setNext(currentNode.getNext());
	            currentNode.setNext(newNode);
	            if (index == this.size) {
	                this.tail = newNode;
	            }
	        }
	        size++;
	    } else {
	        throw new IllegalArgumentException();
	    }
	}


	public void remove(int index) {
	    if (index >= 0 && index < this.size) {
	        if (index == 0) {
	            this.head = this.head.getNext();
	            if (this.size == 1) {
	                this.tail = null;
	            }
	        } else {
	            Node currentNode = this.head;
	            for (int i = 0; i < index - 1; i++) {
	                currentNode = currentNode.getNext();
	            }
	            currentNode.setNext(currentNode.getNext().getNext());
	            if (index == this.size - 1) {
	                this.tail = currentNode;
	            }
	        }
	        this.size--;
	    } else {
	        throw new IllegalArgumentException("Index out of bounds");
	    }
	}



	public int getSize() {
		return size;
	}

	public void add(Object element) {
		Node newNode = new Node(element);
		if(this.head == null) {
		this.head = newNode;
			this.tail = this.head;
		} else {
			this.tail.setNext(newNode);
	        this.tail = newNode;
	    }
	    size++;
	}

		
	}

	


