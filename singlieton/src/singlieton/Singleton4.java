package singlieton;
/*
 * 懒汉式：
 * 延迟创建这个实例对象
 * 适用于单线程，可能有线程安全问题
 * 
 */
public class Singleton4 {
	private static Singleton4 instance;
	private Singleton4() {
		
	}
	public static Singleton4 getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Singleton4();
		}
		return instance;
				
	}
}
