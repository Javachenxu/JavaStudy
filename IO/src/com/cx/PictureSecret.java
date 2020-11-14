package com.cx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

//图片的加密与解密
public class PictureSecret {
	@Test
	//加密
	public void test1() {
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		
		try {
			File fisFile = new File("fate.jpg");
			File fosFile = new File("fate3.jpg");
			fis = new FileInputStream(fisFile);
			fos = new FileOutputStream(fosFile);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				for (int i = 0; i < len; i++) {
					buffer[i] = (byte) (buffer[i] ^ 5);
				}
				fos.write(buffer, 0, len);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) 
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	//解密
	@Test
	public void test2() {
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		
		try {
			File fisFile = new File("fate3.jpg");
			File fosFile = new File("fate4.jpg");
			fis = new FileInputStream(fisFile);
			fos = new FileOutputStream(fosFile);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) != -1) {
				for (int i = 0; i < len; i++) {
					buffer[i] = (byte) (buffer[i] ^ 5);
				}
				fos.write(buffer, 0, len);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) 
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
