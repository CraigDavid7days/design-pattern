package com.sun.simplefactory;

import com.sun.context.FactoryAsus;
import com.sun.context.FactoryLenovo;
import com.sun.context.IFactory;

public  class SimpleFactory {
	

	
	public  IFactory getFactory(Class<?> clazz) {
		IFactory factory = null;
		try {
			factory = (IFactory) clazz.newInstance();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
		return factory;
	}
}
