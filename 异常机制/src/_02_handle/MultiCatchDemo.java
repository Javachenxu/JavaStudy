package _02_handle;
//多个异常捕获
public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		String snum1 = "12";
		String snum2 = "0";
		try {
			//把string类型转换为int类型
			int num1 = Integer.parseInt(snum1);
			int num2 = Integer.parseInt(snum2);
			System.out.println("------------");
			int ret = num1 / num2;
			System.out.println("结果=" + ret);
			
		} catch (ArithmeticException e) {
			System.out.println("除数为0");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("格式类型转换异常");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end...");
	}

}
