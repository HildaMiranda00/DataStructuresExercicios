package doubleLinkedList;
import arrayList.List;
public class DoubleLinkedList implements List{

	private Node head;
	private Node tail;
	private int size;
	
	public Object get(int index) {
		Node currentNode = this.head;
		if(index < size && index >= 0) {
		for(int i = 0; i < index; i++) {
			currentNode = head.getNext();
		
		}
		}
		return currentNode;
	}

	public void add (Object element) {
		Node newNode = new Node(element);
		
	}

	public void add(Object element, int index) {
		
	}

	public void remove(int index) {
		
	}

	public int getSize() {
		return 0;
	}

}
