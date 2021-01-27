package com.local.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.local.spring.springdemo.services.OrderType;

public class ConstructorSpringApp {

	public static void main(String[] args) {
		
		// load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		String order = "myDepositOrderType";
		
		OrderType orderType = context.getBean(order, OrderType.class);
		
		System.out.println(orderType.getType());
		System.out.println(orderType.getDailyFortune());

		context.close();
	}

}
