package com.local.spring.springdemo.order;

import com.local.spring.springdemo.services.OrderType;

public class ComercialOrderType implements OrderType {

	@Override
	public String getType() {
		return "I'm a Comercial order!";
	}
	
}
