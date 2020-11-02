package queue;

import linked.MyLinkedList;

public class MyDeque extends MyLinkedList {
	//查询头
	public Object getFirst() {
		return this.first.ele;
	}
	//查询尾
	public Object getLast() {
		return this.last.ele;
	}
	//删除头节点
	public void removeFirst() {
		remove(this.first);
	}
	//删除尾结点
	public void removeLast() {
		remove(this.last);
	}
	//头插
	public void addFirst(Object ele) {
		super.firstadd(ele);
	}
	//尾插
	public void addLast(Object ele) {
		super.lastadd(ele);
	}

}
