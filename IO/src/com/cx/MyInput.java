package com.cx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {
	public static String readString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	public static int readInt() {
		return Integer.parseInt(readString());
	}
	public static double readDouble() {
		return Double.parseDouble(readString());
	}
	public static double readByte() {
		return Byte.parseByte(readString());
	}
	public static double readShort() {
		return Short.parseShort(readString());
	}
	public static double readLong() {
		return Long.parseLong(readString());
	}
	public static double readFloat() {
		return Float.parseFloat(readString());
	}
}
