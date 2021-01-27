package com.local.spring.springdemo.order;

import com.local.spring.springdemo.services.FortuneService;
import com.local.spring.springdemo.services.OrderType;

public class ComercialOrderType implements OrderType {

	private FortuneService fortuneService;
	
	public ComercialOrderType(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getType() {
		return "I'm a Comercial order!";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}
	
	public void sayHelloOnStartup() {
		System.out.println(">>>>>>>>>>>>> Hello!");
	}

	public void sayGoodbyeOnCleanup() {
		System.out.println(">>>>>>>>>>>>> Goodbye!");
	}
	
}
