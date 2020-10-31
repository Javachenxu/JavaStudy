package day_02._01_producer_consumer;

public class App {

	public static void main(String[] args) {
		ShareResource resource = new ShareResource();
		new Thread(new Producer(resource)).start();
		new Thread(new Consumer(resource)).start();
	}

}
