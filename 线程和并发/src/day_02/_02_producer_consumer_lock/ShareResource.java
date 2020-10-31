package day_02._02_producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	/**
	 * 生产者向共享资源对象存储数据
	 * @param name 存储的姓名
	 * @param gender  存储的性别
	 */
	 public void push(String name,String gender) {
		lock.lock();
		try {
			while (!isEmpty) {
				condition.await();
			}
			//------生产开始-------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//------生产结束------
			condition.signal();
			isEmpty = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	/**
	 * 消费者从共享资源对象中取出资源
	 */
	public void popup() {
		lock.lock();
		try {
			while (isEmpty) {
				condition.await();
			}
			//-----消费开始------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----消费结束------
			isEmpty = true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
}
