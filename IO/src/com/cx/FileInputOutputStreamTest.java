package com.cx;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


import org.junit.Test;

public class FileInputOutputStreamTest {
	//字节流不能准确的传输文本文件。
	@Test
	public void testFileInputStream() {
		//造文件
		//造流
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			byte[] buffer = new byte[5];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				String str = new String(buffer, 0, len);
				System.out.print(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			if(fis != null)
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	
	}
	//字节流复制非文本文件
	@Test
	public void testFileInputOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File srcFile = new File("fate.jpg");
			//命令大小写不敏感
			File destFile = new File("fate2.jpg");
			
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(destFile);
			
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer,0,len);
			}
			System.out.println("复制成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) 
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) 
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
