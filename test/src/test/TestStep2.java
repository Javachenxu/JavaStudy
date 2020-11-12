package test;

import org.junit.Test;
//迭代法，效率要高于递归法，没有重复操作。
public class TestStep2 {
	@Test
	public void test() {
		System.out.println(loop(4));
	}
	public int loop(int n) {
		if (n < 1) {
			throw new IllegalArgumentException(n + "n不能小于1");
		}
		if (n == 1||n == 2) {
			return n;
		}
		int one = 1;
		int two = 2;
		int sum = 0;
		for (int i = 3; i <= n ; i++) {
			sum = one + two;
			one = two;
			two = sum;
		}
		return sum;
	}
}
