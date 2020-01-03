package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config){
		System.out.println("init() 실행되었다!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws IOException{
		System.out.println("service() started!");
	}

}
