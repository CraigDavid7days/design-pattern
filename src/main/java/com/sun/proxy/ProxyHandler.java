package com.sun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private Object target;
	
	

	public ProxyHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	
		this.before();
		Object o = method.invoke(target, args);
		this.after();
		return o;
	}
	
	private void before() {
		System.out.println("before invoke");
	}
	
	private void after() {
		System.out.println("after invoke");
	}

}
