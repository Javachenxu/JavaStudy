package day_01._03_thread;

import org.omg.CORBA.PRIVATE_MEMBER;

public class AnonymousinnerInnerClass {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.println("打游戏" + i);
			if (i == 10) {
				new Thread() {
					public void run() {
						for (int i = 1; i <= 50; i++) {
							System.out.println("播放音乐" + i);
						}
					};
				}.start();
				}
			}
		}
		
	private static void test1() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("打游戏" + i);
			if (i == 10) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						for (int i = 1; i <= 50; i++) {
							System.out.println("播放音乐" + i);
						}
					}
				}).start();
			}
		}
	}
}
