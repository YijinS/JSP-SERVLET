package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerinfo")
public class HeaderinfoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>test></title></head>");
		out.print("<body>");
		
		Enumeration<String> em = req.getHeaderNames(); //header names ��Ƽ� ��ȯ
		
		while(em.hasMoreElements()) { //Ŀ�� ������ ��ü ���� �Ǵ�
			String s = em.nextElement();  //Enumeration<String> - String ������ ��� 
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}
		
		out.print("</body></html>");
		out.close();
	}

}
