package com.sun.strategy;

import java.math.BigDecimal;

public class StrategyTest {

	public static void main(String[] args) {
		Calc c=new Calc(new Add());
		c.calc(BigDecimal.valueOf(1.232), BigDecimal.valueOf(2));
	}

}
