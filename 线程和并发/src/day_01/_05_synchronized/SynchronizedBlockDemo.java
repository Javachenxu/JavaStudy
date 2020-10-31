package day_01._05_synchronized;

class Apple2 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			synchronized (this) {
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
}

public class SynchronizedBlockDemo {
	
	//runnable接口方式实现:3个小孩吃50个苹果的比赛
		public static void main(String[] args) {
			Apple2 a = new Apple2();
			new Thread(a,"小A").start();
			new Thread(a,"小B").start();
			new Thread(a,"小C").start();
		}
	}
