package queue;

public class MyDequeDemo {

	public static void main(String[] args) {
		MyDeque deque = new MyDeque();
		deque.addFirst(24);
		deque.addFirst(63);
		deque.addLast("A");
		deque.addLast("C");
		System.out.println(deque);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
	}

}
