package day_01._04_extends_vs_implements;

class Apple implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
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
}
//runnable接口方式实现:3个小孩吃50个苹果的比赛
public class ImplementsDemo {

	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}

}
