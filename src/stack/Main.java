package stack;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(5);
		stack.push(7);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}
}
