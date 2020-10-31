package day_01._02_process;

import java.io.IOException;

public class ProcessDemo {
	//在Java中开启一个进程，运行记事本程序
	public static void main(String[] args) throws IOException {
		//方法1：使用runtime类的exec方法
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		//方法2：使用ProcessBuilder类的start方法
		ProcessBuilder pd = new ProcessBuilder("notepad");
		pd.start();
	}

}
