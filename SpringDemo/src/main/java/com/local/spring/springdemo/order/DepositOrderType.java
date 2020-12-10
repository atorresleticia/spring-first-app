package com.local.spring.springdemo.order;

import com.local.spring.springdemo.services.OrderType;

public class DepositOrderType implements OrderType {

	@Override
	public String getType() {
		return "I'm a Deposit order!";
	}

}
