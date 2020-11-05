package com.cx.day01._01_file;

import java.io.File;

import javax.swing.JApplet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FileDemo2 {

	public static void main(String[] args) {
		test1();
		test2();
	}
	private static void test1() {
		File f1 = new File("D:/abc/123.txt");
		//操作File路径和名称:
		//File getAbsoluteFile() :获取绝对路径
		System.out.println("获取绝对路径" + f1.getAbsoluteFile());
		//String getAbsolutePath():获取绝对路径
		System.out.println("获取绝对路径" + f1.getAbsolutePath());
		//String getPath() :获取文件路径
		System.out.println("获取文件路径" + f1.getPath());
		//String getName() :获取文件名称
		System.out.println("获取文件名称" + f1.getName());
		//File getParentFile():获取上级目录文件
		System.out.println("获取上级目录文件" + f1.getParentFile());
		//String getParent() :获取上级目录路径
		System.out.println("获取上级目录路径" + f1.getParent());
	}

	private static void test2() {
		File f2 = new File("D:/abc/123.txt");
		//检测File状态的方法:
		//boolean canExecute() :判断是否是可执行文件
		System.out.println(f2.canExecute());
		//boolean canRead() :判断该文件是否可读
		System.out.println(f2.canRead());
		//boolean canWrite():判断该文件是否可写
		System.out.println(f2.canWrite());
		//boolean isHidden():判断该文件是否是隐藏文件
		System.out.println(f2.isHidden());
		//long lastModified():判断该文件的最后修改时间
		System.out.println(new java.util.Date(f2.lastModified()).toLocaleString());
		//toLocalString()方法已过期
		//long length():获取该文件的长度大小(单位字节)
 		System.out.println(f2.length());
	}

	

}
