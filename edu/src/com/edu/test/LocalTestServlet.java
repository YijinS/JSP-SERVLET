package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/local")
public class LocalTestServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int number =0;
		String str = req.getParameter("msg");
		
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>Multithread Test</title></head>");
		out.println("<body><h2>ó�� ���(��������)</h2>");
		
		while(number++ <10) {
			out.print(str + " : " + number + "<br>");
			out.flush();
			System.out.println(str + " : " + number);
			try{
				Thread.sleep(1000); //1��
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
		out.println("<h2>done"+str+ " !!<h2>");
		out.println("</body></html>");
		out.close();
	}

}
