package com.sun.strategy;

import java.math.BigDecimal;

public class Multi implements Operation {

	@Override
	public void op(BigDecimal a, BigDecimal b) {
		System.out.println(a.multiply(b));

	}

}
