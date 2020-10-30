package _01_why;

class Car{
	public static final int NO_OK = 0;
	public static final int OK = 1;

	public int run() {
		int a = 2;
		if (a == 2) {
			System.out.println("爆胎了");
			return NO_OK;
		} else {
			System.out.println("开车去上班");
			return OK;
		}
	}
}
class Worker {
	public static final int LATE = 0;
	public static final int IN_TIME = 1;
	private Car car = null;

	Worker(Car car) {
		this.car  = car;
	}
	public int gotowork() {
		if (car.run() == Car.NO_OK) {
			walk();//走路
			return LATE;
		} else {
			System.out.println("开车到公司");
			return IN_TIME;
		}
	}
	private void walk() {
		System.out.println("走路上班");
	}
}
public class WhyDemo {
	public static void main(String[] args) {
		Car c = new Car();
		Worker worker = new Worker(c);
		if (worker.gotowork() == Worker.LATE) {
			System.out.println("扣钱");
		} else {
			System.out.println("发奖金");
		}
	}
}
