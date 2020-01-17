package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterTwo implements Filter{
	String charset;
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출 ... two");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding(charset);
		System.out.println("dofilter() 호출 전 .... two");
		chain.doFilter(req, res);
		System.out.println("dofilter() 호출 후 .... two");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("init() 호출 ... two");
		charset = config.getInitParameter("en");

		
	}

}
