package com.cx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class OtherStreamTest {
	//输入输出流
	//需求：从键盘输入字符串，要求将读取到的整行字符串转成大写输出，
	//然后继续继续输入操作，直至当输入“e”，或者“exit”时，退出程序
	@Test
	public void test1() {
		BufferedReader br = null;
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			while (true) {
				System.out.println("请输入字符串：");
				String date = br.readLine();
				if ("e".equalsIgnoreCase(date) || "exit".equalsIgnoreCase(date)) {
					System.out.println("程序结束！");
					break;
				}
				//转换成大写
				String upperCase = date.toUpperCase();
				System.out.println(upperCase);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
