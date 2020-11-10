package test;
//类初始化操作
public class Father {
	private int i = test();
	private static int j = Method();
	static {
		System.out.print("(1)");
	}
	Father() {
		System.out.print("(2)");
	}
	{
		System.out.print("(3)");
	}
	public int test() {
		System.out.print("(4)");
		return 1;
	}
	public static int Method() {
		System.out.print("(5)");
		return 1;
	}
}
