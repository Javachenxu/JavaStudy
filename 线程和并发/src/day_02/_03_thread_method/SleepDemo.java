package day_02._03_thread_method;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("还剩"+ i +"秒");
			Thread.sleep(1000);
		}
		System.out.println("爆炸");
	}

}
