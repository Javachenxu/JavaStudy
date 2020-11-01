package day_02._03_thread_method;
class PriorityThread extends Thread{
	public PriorityThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(super.getName() + "-" + i);
		}
	}
}
public class PriorityDemo {

	public static void main(String[] args) {
		//设置主方法的优先级
		//Thread.currentThread().setPriority(7);
		//获取主方法的优先级
		//System.out.println(Thread.currentThread().getPriority());
		PriorityThread min1 = new PriorityThread("低优先级A");
		min1.setPriority(Thread.MIN_PRIORITY);//优先级为1
		PriorityThread min2 = new PriorityThread("低优先级B");
		min2.setPriority(3);//优先级为3
		PriorityThread min3 = new PriorityThread("低优先级C");
		min3.setPriority(4);//优先级为4
		PriorityThread min4 = new PriorityThread("低优先级D");
		min4.setPriority(5);//优先级为5
		PriorityThread max1 = new PriorityThread("高优先级AA");
		max1.setPriority(8);//优先级为8
		PriorityThread max2 = new PriorityThread("高优先级AAA");
		max2.setPriority(Thread.MAX_PRIORITY);//优先级为10
		min1.start();
		min2.start();
		min3.start();
		min4.start();
		max1.start();
		max2.start();
	}

}
