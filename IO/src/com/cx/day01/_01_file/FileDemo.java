package com.cx.day01._01_file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//获取属性分隔符
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		//获取路径分隔符
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(pathSeparator + "----" + pathSeparatorChar);
		System.out.println(separator + "----" + separatorChar);
		
	}
}
