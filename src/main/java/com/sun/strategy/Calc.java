package com.sun.strategy;

import java.math.BigDecimal;

public class Calc {
	private Operation operation;

	public Calc(Operation operation) {
		super();
		this.operation = operation;
	}
	
	public void calc(BigDecimal a, BigDecimal b){
		operation.op(a, b);
	}
	
}
