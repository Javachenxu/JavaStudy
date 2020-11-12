package test;

import org.junit.jupiter.api.Test;

public class TestStep {
	@Test
	public void test(){
		System.out.println(fn(1));
	}
	//递归
	//实现f(n):求n步台阶，一共有几种走法
	public int fn(int n) {
		if (n < 1) {
			throw new IllegalArgumentException(n +"不能小于1");
		}
		if (n == 1 || n == 2) {
			return n;
		}
		return fn(n - 1) + fn(n - 2);
	}
}
