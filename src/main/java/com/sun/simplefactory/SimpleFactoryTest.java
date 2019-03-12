package com.sun.simplefactory;

import com.sun.context.FactoryAsus;
import com.sun.context.IFactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		
		IFactory factory=new SimpleFactory().getFactory(FactoryAsus.class);
		System.out.println(factory.getName());

		

	}

}
