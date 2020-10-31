package day_01._05_synchronized;
//同步方法实现线程安全
class Apple1 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
				eat();
		}
	}
	synchronized private void eat() {
		if (num > 0) {
			System.out.println(Thread.currentThread().getName() + "吃了编号为" + num + "苹果");
			try {
				Thread.sleep(10);//模拟网络延迟
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num--;
		}
	}
}
public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Apple1 a = new Apple1();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}
}
