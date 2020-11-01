package array;

import java.util.Arrays;

public class MyArrayList {
			//存储任意类型的元素
			private static Object[] elements = null;
			//数组中存储多少个元素
			private static int size = 0;
			private static final int default_initial_Capacity = 10;
		//1):初始容量为10的线性列表,准备用来存储元素
			
			public MyArrayList() {
				this(default_initial_Capacity);
			}
			
			public MyArrayList(int initialCapacity) {
				if (initialCapacity < 0) {
					throw new IllegalArgumentException("容量不能为负数");
				}
				elements = new Object[initialCapacity];
			}
		//2):保存新的元素
			public static void add(Object ele) {
				if (size == elements.length) {
					Object[] temp = Arrays.copyOf(elements, elements.length * 2);
					elements = temp;
				}
				elements[size] = ele;
				size++;
			}
		//3):查询指定索引位置的元素
			public static Object get(int index) {
				if (index < 0 || index >= size) {
					throw new IllegalArgumentException("索引越界");
				}
				return elements[index];
			}
		//4):替换指定索引位置的元素值
			public static void set(int index, Object ele) {
				if (index < 0 || index >= size) {
					throw new IllegalArgumentException("索引越界");
				}
				elements[index] = ele;
			}
		//5):删除指定索引位置得元素
			public static void delete(int index) {
				if (index < 0 || index >= size) {
					throw new IllegalArgumentException("索引越界");
				}
				for (int i = index; i < size - 1; i++) {
					elements[i] = elements[i + 1];
				}
				elements[size - 1] = null;
				size--;
			}
			//6):获取数组长度
			public int size() {
				return size;
			}
			//7):判断是否为空
			public boolean isEmpty() {
				return size == 0;
			}
			//8):清空数组
			public void clear() {
				this.elements = new Object[default_initial_Capacity];
				size = 0;
			}
			//9):打印数组
			
			public String toString() {
				if (elements == null) {
					return "null";
				}
				if (size == 0) {
					return "[]";
				}
				StringBuilder sb = new StringBuilder(2 * size);
				sb.append("[");
				for (int i = 0; i < size; i++) {
					sb.append(elements[i]);
					if (i == size - 1) {
						sb.append("]");
					} else {
						sb.append(",");
					}
				}
				return sb.toString();
			}
}
