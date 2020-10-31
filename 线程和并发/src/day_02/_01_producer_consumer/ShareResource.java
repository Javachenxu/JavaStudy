package day_02._01_producer_consumer;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	/**
	 * 生产者向共享资源对象存储数据
	 * @param name 存储的姓名
	 * @param gender  存储的性别
	 */
	 synchronized public void push(String name,String gender) {
		
		try {
			while (!isEmpty) {//当isEmpty为false的时候，不空等着消费者来获取
				//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池，只能被其它线程所唤醒
				this.wait();
			}
			//------生产开始-------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//------生产结束------
			isEmpty = false;//设置共享资源中数据不为空
			this.notify();//唤醒一个消费者
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 消费者从共享资源对象中取出资源
	 */
	synchronized public void popup() {
		try {
			while (isEmpty) {//当前isEmpty为true的时候，为空，等着生产者来生产。
				//使用同步锁来调用，表示当前线程释放同步锁，进入等待池，只能被其他线程唤醒。
				this.wait();
			}
			//-----消费开始------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----消费结束------
			isEmpty = true;
			this.notify();//唤醒一个生产者
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
