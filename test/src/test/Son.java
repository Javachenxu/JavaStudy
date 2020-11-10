package test;
/*
 * 	类的初始化过程
 *	1.一个类要创建实例需要先加载并初始化该类
 *	1.1main方法所在的类需要先加载和初始化。
 *	2.一个子类要初始化需要先初始化父类
 *	3.一个类初始化就是执行<clinit>方法。
 *	3.1<clinit>()方法由静态类变量显示赋值代码和静态代码块组成。
 *	3.2静态类变量显示赋值代码和静态代码块的执行顺序是由上而下顺序执行的。
 *	3.3<clinit>()方法只能执行一次
 */
/*
 * 
 */
public class Son extends Father {
	private int i = test();
	private static int j = Method();
	static {
		System.out.print("(6)");
	}
	Son() {
		System.out.print("(7)");
	}
	{
		System.out.print("(8)");
	}
	public int test() {
		System.out.print("(9)");
		return 1;
	}
	public static int Method() {
		System.out.print("(10)");
		return 1;
	}
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println();
		Son s2 = new Son();
	}
}
