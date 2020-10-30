package _05_exception_class;
//车坏了的异常
class CarWrongException extends RuntimeException{
	private static final long seriaVersionUID = 1L;

	public CarWrongException(String message, Throwable cause) {
		super(message, cause);
	}

	public CarWrongException(String message) {
		super(message);
	}
}
	//上班迟到异常
class LateWrongException extends RuntimeException{
	private static final long seriaVersionUID = 1L;

	public LateWrongException(String message, Throwable cause) {
		super(message, cause);
	}

	public LateWrongException(String message) {
		super(message);
	}
}
//车
class Car{

	public void run() throws CarWrongException {
		int a = 1;
		if (a == 2) { //爆胎了
			throw new CarWrongException("车爆胎了");
		}
		System.out.println("开车去上班");
	}
}
class Worker {
	private Car car = null;

	Worker(Car car) {
		this.car  = car;
	}
	public void gotowork() throws LateWrongException {	
	try {
		car.run();
		System.out.println("上班");
	} catch (CarWrongException e) {
		e.printStackTrace();
		this.walk();
		throw new LateWrongException("迟到的原因："+e.getMessage());
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
		try {
			worker.gotowork();
			System.out.println("发奖金");
		} catch (LateWrongException e) {
			System.out.println("扣钱");
		}
	}
}

