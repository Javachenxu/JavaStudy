package com.cx.connection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class ConnectionTest {
	//方式一：
	@Test
	public void getConnection1() throws Exception {
		//创建为java.sql.driver接口的实现类的对象
		Driver driver = null;
		driver = new com.mysql.jdbc.Driver();
		//提供url，指明具体操作的数据库
		String url = "jdbc:mysql://localhost:3306/test";
		//提供Propertiess的对象，保存用户名和密码
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "135790");
		//调用driver对象，获取连接
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
	}
	//方式二：对方式一的迭代
	@Test
	public void getConnection2() throws Exception{
		//1.获取Driver实现类对象：使用反射
		Class clazz = Class.forName("com.mysql.jdbc.Driver");
		Driver driver = (Driver) clazz.newInstance();
		//提供url，指明具体操作的数据库
		String url = "jdbc:mysql://localhost:3306/test";
		//提供Propertiess的对象，保存用户名和密码
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "135790");
		//调用driver对象，获取连接
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
	}
	//方式三：在方式二的基础上迭代
	@Test
	public void getConnection3() throws Exception {
		//数据库连接的四个基本要素
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "135790";
		String driverName = "com.mysql.jdbc.Driver";
		//获取Driver实现类对象
		Class clazz = Class.forName(driverName);
		Driver driver = (Driver) clazz.newInstance();
		//注册驱动
		DriverManager.registerDriver(driver);
		//调用driver对象，获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
	//方式四：
	@Test
	public void getConnection4() throws Exception {
		//数据库连接的四个基本要素
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "135790";
		String driverName = "com.mysql.jdbc.Driver";
		//获取Driver实现类对象
		Class.forName(driverName);
//		Driver driver = (Driver) clazz.newInstance();
//		//注册驱动
//		DriverManager.registerDriver(driver);
		/*
        	可以注释掉上述代码的原因，是因为在mysql的Driver类中声明有：
        static {
            try {
                DriverManager.registerDriver(new Driver());
            } catch (SQLException var1) {
                throw new RuntimeException("Can't register driver!");
            }
        }

         */
		//调用driver对象，获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
	@Test
	//方式五：使用配置文件
	public void getConnection5() throws Exception {
		InputStream is = ConnectionTest.class.getClassLoader()
				.getResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		pros.load(is);
		//读取配置信息
		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");
		//加载驱动
		Class.forName(driverClass);
		//获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
