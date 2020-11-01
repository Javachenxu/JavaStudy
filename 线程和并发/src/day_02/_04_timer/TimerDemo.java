package day_02._04_timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("你好世界！");
			}
		}, 3000,1000);
		System.out.println("end...");

	}

}
