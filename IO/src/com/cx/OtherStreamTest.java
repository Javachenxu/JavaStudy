package com.cx;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;

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
	@Test
	public void test2() {
		PrintStream ps  = null;
		try {
			FileOutputStream fos = new FileOutputStream("test2.txt");
			//创建打印输出流，设置为自动刷新
			ps = new PrintStream(fos,true);
			if (ps != null) {
				System.setOut(ps);
			}
			for (int i = 0; i < 255; i++) {
				System.out.print((char) i);
				if (i % 50 == 0) {
					System.out.println();//换行
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	//数据流
	@Test
	public void test3() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("data.txt"));
			dos.writeUTF("你好");
			dos.flush();
			dos.writeInt(23);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	@Test
	public void test4() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("data.txt"));
			String name = dis.readUTF();
			int age = dis.readInt();
			System.out.println(name);
			System.out.println(age);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
}
