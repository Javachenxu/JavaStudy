package com.cx.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.cx.connection.ConnectionTest;

/**
 * @Description 操作数据库的工具类
 * @author 24750
 *
 */
public class JDBCUtils {
	public static Connection getConnection() throws Exception {
		InputStream is = ClassLoader.getSystemClassLoader()
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
		return conn;
	}
	public static void closeResource(Connection conn,Statement ps) {
		
		//关闭资源
		try {
			if(ps != null)
				ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
