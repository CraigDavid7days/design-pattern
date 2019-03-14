package com.sun.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		IPerson target = new Person();
		IPerson proxy = (IPerson) ProxyFactory.getProxyInstance(target);
		 
		proxy.work();
	}

}
