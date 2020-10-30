package _05_exception_class;

public class RegisterDemo {
	//模拟数据库中已经存在的账号
	private static String[] names = {"will","lucy","lily"};
	public static void main(String[] args) {
		try {
			checkUsername("wil");
			System.out.println("注册成功");
		} catch (Exception e) {
			String errorMsg = e.getMessage();
			System.out.println("给用户看" + errorMsg);
		}
		
	}
	
	//判断当前账号是否已经被注册
	public static boolean checkUsername(String username) {
		for (String name : names) {
			if (name.equals(username)) {
				throw new LogicException(name + "已经被注册了！");
			}
		}
		return true;
		
	}

}
