package com.cx.team.service;
//自定义异常类
public class TeamException extends Exception {
	static final long serialVersionUID = -3387516993124229948L;
	public TeamException() {
		// TODO Auto-generated constructor stub
	}
	
	public TeamException(String msg){
		super(msg);
	}
	
}
