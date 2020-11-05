package day01.iterator;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
//集合元素的迭代操作
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("12");
		list.add("13");
		list.add("19");
		list.add("18");
		list.add("14");
		for (int i = 0; i < list.size(); i++) {
			Object ele = list.get(i);
		System.out.println(ele);
		}
		System.out.println("--------------");
		Iterator it = list.iterator();
		//foreach操作迭代器遍历
		for (Object ele : list) {

			if ("12".equals(ele)) {
				//list.remove(ele);//不能使用集合框架所带的的remove方法，
				//只能使用迭代器的remove方法，否则报并发修改异常。
				it.remove();
			}
			System.out.println(ele);
		}
		System.out.println("--------------");
		//while循环操作迭代器遍历
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------");
		//for循环操作迭代器遍历
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		
	}
}
