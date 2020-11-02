package linked;

public class MyLinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.lastadd("A");
		list.lastadd("C");
		list.lastadd("B");
		list.firstadd("D");
		list.firstadd("的");
		list.lastadd("G");
		list.remove("C");
		System.out.println(list);
	}

}
