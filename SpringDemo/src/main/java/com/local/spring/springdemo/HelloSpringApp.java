package com.local.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.local.spring.springdemo.services.OrderType;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		OrderType orderType = context.getBean("myOrderType", OrderType.class);
		
		System.out.println(orderType.getType());

		context.close();
	}

}
