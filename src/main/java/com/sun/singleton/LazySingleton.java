package com.sun.singleton;

public class LazySingleton {
	private LazySingleton() {}
	
	private static LazySingleton lazySingleton;
	
	public static synchronized  LazySingleton getInstance() {
		
		return null != lazySingleton ? lazySingleton : new LazySingleton();
	}
}
