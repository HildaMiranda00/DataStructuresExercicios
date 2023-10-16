package queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(35);
		queue.dequeue();
		System.out.println(queue.size());
		System.out.println(queue.peek());
	}

}
