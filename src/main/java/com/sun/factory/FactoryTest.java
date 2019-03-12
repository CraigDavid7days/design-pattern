package com.sun.factory;

import com.sun.context.FactoryLenovo;
import com.sun.context.IFactory;

public class FactoryTest {

	public static void main(String[] args) {
		
		IFactory factory=new FactoryLenovo();
		System.out.println(factory.getName());

		

	}

}
