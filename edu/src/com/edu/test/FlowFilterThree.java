package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName ="timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis(); //�޼ҵ尡 ����Ǵ� �ð� . ������ ���� ��
		chain.doFilter(req, resp);
		long endTime = System.currentTimeMillis(); //������ ���� �� 
		long executerTime = endTime - startTime; // ������ ���� �ð�
		System.out.println("���� �ð� :" + executerTime + "ms");
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
