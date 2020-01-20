package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/errorHandler")
public class ErrorHandlerServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		Integer code = (Integer) req.getAttribute("javax.servlet.error.status_code");
		String msg = (String) req.getAttribute("javax.servlet.error.message");
		Object type = req.getAttribute("javax.servlet.error.exception_type");
		Throwable exception = (Throwable) req.getAttribute("javax.servlet.error.exception");
		String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
		
		out.print("<h2>error code :" + code + "</h2>");
		out.print("<h2>error msg :" + msg + "</h2>");
		out.print("<h2>error type :" + type + "</h2>");
		out.print("<h2>error exception :" + exception + "</h2>");
		out.print("<h2>error uri :" + uri + "</h2>");
	}

}
