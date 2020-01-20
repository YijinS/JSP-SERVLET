package com.edu.test;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestRequestListener implements ServletRequestListener{
	
	public TestRequestListener() {
		System.out.println("testrequestlistener 按眉 积己");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("testrequestlistener 按眉 昏力");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("testrequestlistener 按眉 檬扁拳");
	}

}
