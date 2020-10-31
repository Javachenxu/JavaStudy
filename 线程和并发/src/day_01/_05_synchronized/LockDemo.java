package day_01._05_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable{
	private int num = 50;
	private final Lock lock = new ReentrantLock();//创建一个锁对象
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
				eat();
		}
	}
	private void eat() {
		lock.lock();//获取锁
		try {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "吃了编号为" + num + "苹果");
			}
				Thread.sleep(10);//模拟网络延迟
				num--;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();//释放锁
		}
	}
}
public class LockDemo {
	public static void main(String[] args) {
		Apple3 a = new Apple3();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}
}
