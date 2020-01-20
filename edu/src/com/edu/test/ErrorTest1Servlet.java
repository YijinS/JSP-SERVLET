package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String getQuery = req.getQueryString(); //Ŭ���̾�Ʈ�� �����ϴ� ���� ���ڿ��� ����
		out.print("query : " + getQuery + "<br>");
		out.print("query length : " + getQuery.length() + "<br>");
		
		out.close();
	}
}
