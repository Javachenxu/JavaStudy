package day_01._03_thread;

/**
 * 
 * @author 24750
 * 步骤:
 * 1):定义一个类A实现于java.lang.Runnable接口,注意A类不是线程类.
 * 2):在A类中覆盖Runnable接口中的run方法.
 * 3):我们在run方法中编写需要执行的操作---->run方法里的,线程执行体.
 * 4):在main方法(线程)中,创建线程对象,并启动线程.
 * 创建线程类对象:             Thread  t = new Thread(new  A());    
 * 调用线程对象的start方法:     t.start();
 * 
 */
//音乐类
class MusicRunnableImpl implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("播放音乐" + i);
		}
		
	}
}
//实现runnable接口

public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			System.out.println("打游戏" + i);
			if (i == 10) {
				Runnable target = new MusicRunnableImpl();
				Thread t = new Thread(target);
				t.start();
			}
		}

	}

}
