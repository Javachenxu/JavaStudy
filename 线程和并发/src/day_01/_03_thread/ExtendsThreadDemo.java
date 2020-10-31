package day_01._03_thread;
/**
 * @author 24750
 * 步骤:
 * 1):定义一个类A继承于java.lang.Thread类.
 * 2):在A类中覆盖Thread类中的run方法.
 * 3):我们在run方法中编写需要执行的操作---->run方法里的,线程执行体.
 * 4):在main方法(线程)中,创建线程对象,并启动线程.
 * 创建线程类对象:             A类   a  =  new   A类();
 * 调用线程对象的start方法:     a.start();//启动一个线程
 * 
 */
class MusicThread extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("播放音乐" + i);
		}
	}
}
public class ExtendsThreadDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println("打游戏" + i);
			if (i == 10) {
				MusicThread music = new MusicThread();
				music.start();
			}
		}
	}

}
