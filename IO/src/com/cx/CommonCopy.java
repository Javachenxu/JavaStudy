package com.cx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class CommonCopy {
	@Test
	public void testCopyFile() {
		long begin = System.currentTimeMillis();
		String srcPath = "H:\\test\\1.vep";
		String destPath = "H:\\test\\2.vep";
		copyFile(srcPath, destPath);
		
		long end = System.currentTimeMillis();
		
		System.out.println("复制操作所要花的时间" + (end - begin));//955
	}
	public void copyFile(String srcPath,String destPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File srcFile = new File(srcPath);
			//路径大小写不敏感
			File destFile = new File(destPath);
			
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

