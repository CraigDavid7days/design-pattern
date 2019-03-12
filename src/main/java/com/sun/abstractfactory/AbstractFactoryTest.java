package com.sun.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		ComputerFactory factory=new ComputerFactory();
		System.out.println(factory.getFactoryAsus().getName());

		

	}

}
