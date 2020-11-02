package stack;

public class MyStackDemo {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(12);
		stack.push(45);
		stack.push(14);
		stack.push(24);
		stack.pop();
		stack.peek();
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
