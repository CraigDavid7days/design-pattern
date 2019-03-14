package com.sun.singleton;

public class HungerSingleton {
	private HungerSingleton() {}
	
	private static final HungerSingleton hungerSingleton = new HungerSingleton();
	
	public static  HungerSingleton getInstance() {
		
		return hungerSingleton;
	}
}
