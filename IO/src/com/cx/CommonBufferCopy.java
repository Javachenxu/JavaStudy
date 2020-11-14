package com.cx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CommonBufferCopy {
	@Test
	public void testCopyFile() {
		long begin = System.currentTimeMillis();
		String srcPath = "H:\\test\\1.vep";
		String destPath = "H:\\test\\3.vep";
		CommonBufferCopy(srcPath, destPath);
		
		long end = System.currentTimeMillis();
		
		System.out.println("复制操作所要花的时间" + (end - begin));//329
	}
	public void CommonBufferCopy( String srcPath,String destPath) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//造文件
			File srcFile = new File(srcPath);
			File destFile = new File(destPath);
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
}
