package day_01._04_extends_vs_implements;
class Person extends Thread{
	private int num = 50;
	public Person(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			if (num > 0) {
				System.out.println(getName() + "吃了编号为" + num-- + "苹果");
			}
		}
	}
}
//继承Thread类方式实现:3个小孩吃50个苹果的比赛
public class ExtendsDemo {

	public static void main(String[] args) {
		new Person("小A").start();
		new Person("小B").start();
		new Person("小C").start();
	}

}
