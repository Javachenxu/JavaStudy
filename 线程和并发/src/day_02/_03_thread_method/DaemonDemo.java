package day_02._03_thread_method;
class DaemonThread extends Thread{
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(super.getName() +"-"+ i);
		}
	}
}
public class DaemonDemo {
	//主线程不能设置为后台线程
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if (i == 10) {
				DaemonThread t = new DaemonThread();
				t.setDaemon(true);
				//设置后台线程必须在线程启动之前
				t.start();
			}
		}

	}

}
