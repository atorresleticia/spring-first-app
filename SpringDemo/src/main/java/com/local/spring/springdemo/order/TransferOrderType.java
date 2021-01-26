package com.local.spring.springdemo.order;

import com.local.spring.springdemo.services.FortuneService;
import com.local.spring.springdemo.services.OrderType;

public class TransferOrderType implements OrderType {
	
	private FortuneService fortuneService;
	
	public TransferOrderType(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getType() {
		return "I'm a Transfer order!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
