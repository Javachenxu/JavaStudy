package com.cx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

//转换流
public class InputStreamReaderTest {
	@Test
	public void test1() {
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			FileOutputStream fos = new FileOutputStream("tetx_gbk.txt");
			isr = new InputStreamReader(fis, "utf-8");
			osw = new OutputStreamWriter(fos, "gbk");
			char[] cbuf = new char[20];
			int len;
			while ((len = isr.read(cbuf)) != -1) {
				osw.write(cbuf, 0, len);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (osw != null)
					osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
