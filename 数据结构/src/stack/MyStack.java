package stack;

import array.MyArrayList;

public class MyStack extends MyArrayList {
	//入栈
	public void push(Object ele) {
		super.add(ele);
	}
	//出栈
	public void pop() {
		int index = super.size() - 1;
		super.delete(index);
	}
	//查询栈顶元素
	public Object peek() {
		int index = super.size() - 1;
		return get(index);
	}
}
