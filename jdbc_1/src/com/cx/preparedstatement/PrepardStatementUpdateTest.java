package com.cx.preparedstatement;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.junit.Test;

import com.cx.util.JDBCUtils;


public class PrepardStatementUpdateTest {
	@Test
	public void CommonUpdate() {
		String sql = "delete from customers where id = ?";
		update(sql,3);
	}
	//通用的增删改操作
	public void update(String sql,Object ...args) {
		//获取连接
		Connection conn = null;
		//预编译sql语句
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			//填充占位符
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);//数据库的索引从1开始，数组的索引从0开始
			}
			//执行sql语句
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//关闭资源
			JDBCUtils.closeResource(conn, ps);
		}
		
	}
	//向表中修改一条数据
	@Test
	public void testUpdate() {
		//获取连接
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConnection();
			//预编译sql语句
			String sql = "update customers set name = ? where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, "肖战");
			ps.setObject(2, 18);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtils.closeResource(conn, ps);
		}
		
	}
	//向表中添加一条数据
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
			String sql = "insert into customers(name,email,birth)value(?,?,?)";
			//?占位符
			ps = conn.prepareStatement(sql);
			
			//填充占位符
			ps.setString(1, "肖战");
			ps.setString(2, "xiaozhan@qq.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = sdf.parse("2010-10-01");
			ps.setDate(3,new Date(date.getTime()));
			
			//执行sql
			ps.execute();
		} catch (Exception e) {
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
