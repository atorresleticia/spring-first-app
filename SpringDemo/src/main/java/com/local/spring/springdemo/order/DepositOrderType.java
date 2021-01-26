package com.local.spring.springdemo.order;

import com.local.spring.springdemo.services.FortuneService;
import com.local.spring.springdemo.services.OrderType;

public class DepositOrderType implements OrderType {

	private FortuneService fortuneService;
	
	private String email;
	
	@Override
	public String getType() {
		return "I'm a Deposit order!";
	}

	@Override
	public String getDailyFortune() {
		return "Damn you! " + fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
