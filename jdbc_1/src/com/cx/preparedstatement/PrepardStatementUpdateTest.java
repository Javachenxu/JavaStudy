package com.cx.preparedstatement;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.junit.Test;


public class PrepardStatementUpdateTest {
	@Test
	public void testInsert() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {//获取连接
			InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
			Properties pros = new Properties();
			pros.load(is);
			//读取配置文件中的4个基本信息
			String user = pros.getProperty("user");
			String password = pros.getProperty("password");
			String url = pros.getProperty("url");
			String driverClass = pros.getProperty("driverClass");
			//加载驱动
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println(conn);
			//预编译sql语句
			String sql = "insert into customers(name,email,birth)value(?,?,?)";//?占位符
			ps = conn.prepareStatement(sql);
			
			//填充占位符
			ps.setString(1, "肖战");
			ps.setString(2, "xiaozhan@qq.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse("2010-10-01");
			ps.setDate(3,(java.sql.Date) new Date(date.getTime()));
			
			//执行sql
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
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
}
