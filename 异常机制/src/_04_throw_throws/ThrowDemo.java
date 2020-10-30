package _04_throw_throws;

public class ThrowDemo {

	public static void main(String[] args) {
		int ret = divdie(10,0);
		System.out.println(ret);
	}

	private static int divdie(int i, int j) {
		System.out.println("begin...");
		if (j == 0) {
			throw new ArithmeticException("除数不能为0");
		}
		System.out.println("-------------");
		try {
			int ret = i / j;
			System.out.println("结果是="+ret);
			return ret;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			}
		System.out.println("end...");
		return 0;
	}

}
