package com.cx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileReaderWriterTest {
	@Test
	public void testFileReader(){
		
		FileReader fr = null;
		try {
			//创建File类的对象，指明读取的数据的来源。（要求此文件一定要存在）
			File file = new File("hello.txt");
			// 创建相应的输入流，将File类的对象作为参数，传入流的构造器中
			fr = new FileReader(file);
			int data = fr.read();
			while (data != -1) {
				System.out.print((char) data);
				data = fr.read();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			if (fr != null)
				//关闭流资源
				fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
	@Test
	public void testFileWriter() {
		//创建相应的输出流，将File类的对象作为参数，传入流的构造器中
		FileWriter fw = null;
		try {
			//创建File类的对象，指明写入的数据的位置。
			File file = new File("hello1.txt");
			fw = new FileWriter(file);
			//写出操作
			fw.write("I have a dream!");
			fw.write("You need have a dream!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//关闭流资源
			try {
				if (fw != null) 
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
