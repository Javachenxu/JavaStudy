package day_02._01_producer_consumer;

public class Producer implements Runnable {
	private ShareResource resource = null;

	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		for (int i = 0 ; i < 50; i++) {
			if (i %2 == 0) {
				resource.push("春哥哥", "男");
			} else {
				resource.push("芬姐", "女");
			}
		}
		
	}
	
}
