package com.sun.strategy;

import java.math.BigDecimal;

public class Sub implements Operation {

	@Override
	public void op(BigDecimal a, BigDecimal b) {
		System.out.println(a.subtract(b));

	}

}
