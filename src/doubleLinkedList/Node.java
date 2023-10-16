package doubleLinkedList;

public class Node {
private Object data;
private Node next;
private Node prev;

public Node(Object data) {
	this.data = data;
	this.next = null;
	this.prev = null;
	
}
public Object getData() {
	return data;
}
public Node getNext() {
	return next;
}
public Node getPrev() {
	return prev;
}
}
