package _02_handle;

public class SingleCatchDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		try {
			int ret = 10 / 0;
			System.out.println("结果是="+ret);
		} catch (ArithmeticException e) {
			System.out.println("异常消息"+e.getMessage());
			System.out.println("异常消息"+e.toString());
			e.printStackTrace();
		} 
		System.out.println("end...");
	}

}
