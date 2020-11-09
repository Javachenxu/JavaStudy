package singlieton;

public class Singleton5 {
	private static Singleton5 instance;
	private Singleton5() {
	}
	public static Singleton5 getInstance() {
		//先判断一次，节省性能
		if (instance == null) {
			synchronized (Singleton6.class) {
				if (instance == null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					instance = new Singleton5();
				}
			}
		}
		return instance;
				
	}
}
