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
		
		Enumeration<String> em = req.getHeaderNames(); //header names 모아서 반환
		
		while(em.hasMoreElements()) { //커서 다음에 객체 유무 판단
			String s = em.nextElement();  //Enumeration<String> - String 변수에 담기 
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}
		
		out.print("</body></html>");
		out.close();
	}

}
