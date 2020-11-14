package com.cx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

import org.junit.Test;

public class BufferedTest {
	@Test
	public void copyBufferStreamTest() {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//造文件
			File srcFile = new File("fate.jpg");
			File destFile = new File("fate3.jpg");
			//造流
			//1.造节点流
			FileInputStream fis = new FileInputStream(srcFile);
			FileOutputStream fos = new FileOutputStream(destFile);
			//2.造缓冲流
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			//读取与写入
			byte[] buffer = new byte[1024];
			int len;
			while ((len = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("文件复制错误");
		} finally {
			try {
				if (bis != null) 
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bos != null) 
					bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	@Test
	public void BufferReaderWriterTest() {
		String frPath = "hello.txt";
		String fwPath = "hello5.txt";
		BufferReaderWriterCopy(frPath, fwPath);
	}
	//缓冲流（字符型）
	public void BufferReaderWriterCopy(String frPath,String fwPath) {
		//2.造缓冲流
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		try {
			//造文件
			File frFile = new File(frPath);
			File fwFile = new File(fwPath);
			//造流
			//1.节点流
			FileReader fr = new FileReader(frFile);
			FileWriter fw = new FileWriter(fwFile);
			bfr = new BufferedReader(fr);
			bfw = new BufferedWriter(fw);
			//读取和写入
			char[] cbuf = new char[10];
				//方式一
			//int len;
//			while ((len = bfr.read(cbuf)) != -1) {
//				bfw.write(cbuf, 0, len);
//			} 
			//方式二
			String date;
			while ((date = bfr.readLine()) != null) {
				bfw.write(date);
				bfw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bfr != null) 
					bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bfw != null)
				bfw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
