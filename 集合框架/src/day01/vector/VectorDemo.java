package day01.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(25);
		v1.add("A");
		v1.add("B");
		System.out.println(v1);
		Vector v2 = new Vector();
		v2.add("A");
		v2.add("B");
		v2.add("C");
		v2.add(2, "你好");//添加在指定位置
		
		v2.add(v1);
		//v2.retainAll(v1);//求交集
		v2.set(2, "hello");//修改元素
		System.out.println(v2);//[A, B, 你好, C, [12, 25, A, B]]，把v1看成整体
		System.out.println(v1.isEmpty());//判断是否为空
		System.out.println(v1.get(3));//获取值
		System.out.println(v1.toArray());
	}

}
