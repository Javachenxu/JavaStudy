package com.cx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;
//随机存取流
public class RandomAccessFileTest {
	@Test
	public void test1() {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try {
			raf1 = new RandomAccessFile("fate.jpg", "r");
			raf2 = new RandomAccessFile("fate5.jpg", "rw");
			
			byte[] buffer = new byte[1024];
			int len;
			while ((len = raf1.read(buffer)) != -1) {
				raf2.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (raf2 != null) {
				try {
					raf2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void test2() {
		RandomAccessFile raf3 = null;
		try {
			raf3 = new RandomAccessFile("hello.txt", "rw");
			//raf3.seek(3);
			raf3.write("xyz".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf3 != null) {
				try {
					raf3.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//使用RandomAccessFile类来实现插入操作
	@Test
	public void test3() {
		RandomAccessFile rqf4 = null;
		try {
			rqf4 = new RandomAccessFile("hello.txt", "rw");
			rqf4.seek(3);
			StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
			
			byte[] buffer = new byte[20];
			int len;
			while ((len = rqf4.read(buffer)) != -1) {
				builder.append(new String(buffer, 0, len));
			}
			rqf4.seek(3);
			rqf4.write("xyz".getBytes());
			rqf4.write(builder.toString().getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rqf4 != null) {
				try {
					rqf4.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
