package linked;

//基于双向链表集合
public class MyLinkedList {
	protected Node first;
	protected Node last;
	protected int size;
	//链表中的每一个节点
	public class Node{
		Node prev;//上一个节点对象
		Node next;//下一个节点对象
		public Object ele;//当前节点存储的数据的值
		public Node(Object ele) {
			this.ele = ele;
		}
	}
	//头插
	public void firstadd(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把之前的第一个节点作为新增节点的下一个节点
			node.next = this.first;
			//把新增节点作为之前的第一个节点上一个节点
			this.first.prev = node;
			//把新增节点作为第一个节点
			this.first = node;
		}
		size++;
	}
	//尾插
	public void lastadd(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			//把新增节点作为之前的最后一个节点下一个节点
			this.last.next = node;
			//把之前的最后一个节点作为新增节点的上一个节点
			node.prev = this.last;
			//把新增节点作为最后一个节点
			this.last = node;
		}
		size++;
	}
	//删除
	public void remove(Object ele) {
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!(current.ele).equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		if (current == first) {
			this.first = current.next;
			this.first.prev = null;
		} else if (current == last) {
			this.last = current.prev;
			this.last.next = null;
		} else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		size--;
	}
	//打印操作
	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		Node current = this.first;//第一个节点
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;//获取自己的下一个节点
		}
				
		return sb.toString();
	}
	
	
}
