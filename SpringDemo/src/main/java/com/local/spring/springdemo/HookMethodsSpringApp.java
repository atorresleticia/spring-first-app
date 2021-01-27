package com.local.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.local.spring.springdemo.order.ComercialOrderType;

public class HookMethodsSpringApp {

	public static void main(String[] args) {
		
		// load context config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hookMethods-applicationContext.xml");
		
		// retrieve bean from spring
		ComercialOrderType firstorderType = context.getBean("myOrderType", ComercialOrderType.class);
		ComercialOrderType secondOrderType = context.getBean("myOrderType", ComercialOrderType.class);
		
		// when context config file set scope to prototype it should return false
		// by default, the scope is set to singleton
		System.out.println("Same reference? ----- " + (firstorderType == secondOrderType));
		System.out.println("Mem location for first reference ------ " + firstorderType);
		System.out.println("Mem location for second reference ----- " + secondOrderType);
		
		context.close();
	}

}
