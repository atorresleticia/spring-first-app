package com.local.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.local.spring.springdemo.order.DepositOrderType;

public class DepositSpringApp {

	public static void main(String[] args) {
		
		// load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		String order = "myDepositOrderType";
		DepositOrderType depositOrder = context.getBean(order, DepositOrderType.class);
		
		System.out.println(depositOrder.getType());
		System.out.println(depositOrder.getDailyFortune());
		System.out.println(depositOrder.getEmail());

		context.close();

	}

}
