package com.edu.test;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class TestSessionAttributeListener implements HttpSessionAttributeListener{
	
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener 按眉  积己");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("技记 按眉俊 加己 眠啊 ");
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("技记 按眉俊 加己 昏力 ");
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("技记 按眉俊 眠啊等 加己 措眉 ");
		
	}

}
