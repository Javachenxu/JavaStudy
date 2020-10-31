package day_02._03_thread_method;
class Join extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("join:"+ i);
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin...");
		Join joinThread = new Join();//创建joinThread线程对象
		for (int i = 0; i < 50; i++) {
			System.out.println("main:"+i);
			if (i == 10) {
				joinThread.start();
			}
			if (i == 20) {
				joinThread.join();//强制运行join线程
			}
		}
		System.out.println("end...");
	}
}
