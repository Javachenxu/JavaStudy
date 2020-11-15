package com.cx;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ObjectOutputInputStream {
	//对象序列化
	@Test
	public void TestObjectOutputStream() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
			oos.writeObject(new String("你好"));
			oos.flush();
			oos.writeObject(new Person("陈俊航",22));
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	//反序列化
	@Test
	public void TestObjectInputStream()  {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.dat"));
			Object obj = ois.readObject();
			
			String str = (String) obj;
			System.out.println(str);
			
			Person p = (Person) ois.readObject();
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
