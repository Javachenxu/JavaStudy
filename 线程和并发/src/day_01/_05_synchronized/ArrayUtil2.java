package day_01._05_synchronized;
//懒汉式-单例模式
public class ArrayUtil2 {
	private ArrayUtil2() {
	}
	private static volatile ArrayUtil2 instance = null;
	public static ArrayUtil2 getInstance() {
		if (instance == null) {
			synchronized (ArrayUtil2.class) {
				if (instance == null) {
					instance = new ArrayUtil2();
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr) {
		//TOOD
	}
}
