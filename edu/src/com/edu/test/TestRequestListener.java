package com.edu.test;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestRequestListener implements ServletRequestListener{
	
	public TestRequestListener() {
		System.out.println("testrequestlistener ��ü ����");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("testrequestlistener ��ü ����");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("testrequestlistener ��ü �ʱ�ȭ");
	}

}
