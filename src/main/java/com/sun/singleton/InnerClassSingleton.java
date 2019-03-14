package com.sun.singleton;

public class InnerClassSingleton {
	private InnerClassSingleton() {}
	
	public static final InnerClassSingleton getInstance() {
		return Inner.holder;
	}
	
	private static class Inner{
		private static final InnerClassSingleton holder = new InnerClassSingleton();
	}
}
