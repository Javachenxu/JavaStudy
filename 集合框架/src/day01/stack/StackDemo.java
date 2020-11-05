package day01.stack;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();//Stack是Vector的子接口
		stack.add(1);
		stack.add(2);
		stack.push(5);
		stack.add(6);
		stack.add(14);
		stack.remove(0);//删除序号为0的元素
		System.out.println(stack);
		//stack.remove(14);//删除元素为14的元素,错误。栈结构只能在一端操作
		System.out.println(stack.isEmpty());
	}

}
