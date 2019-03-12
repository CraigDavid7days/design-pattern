package com.sun.abstractfactory;

import com.sun.context.FactoryAsus;
import com.sun.context.FactoryLenovo;
import com.sun.context.IFactory;

public class ComputerFactory extends AbstractFactory {

	@Override
	public IFactory getFactoryAsus() {
	
		return new FactoryAsus();
	}

	@Override
	public IFactory getFactoryLenovo() {
		
		return new FactoryLenovo();
	}

}
