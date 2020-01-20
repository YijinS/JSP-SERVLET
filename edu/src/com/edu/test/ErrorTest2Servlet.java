package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		try {
			String getQuery = req.getQueryString(); 
			out.print("query : " + getQuery + "<br>");
			out.print("query length : " + getQuery.length() + "<br>");
			
		} catch(Exception e) {
			out.print("��û�� ó���ϴ� ���� ������ �߻��Ͽ����ϴ� : " +e);
		}
		
		out.print("<br> done!");
		out.close();
	}

}
