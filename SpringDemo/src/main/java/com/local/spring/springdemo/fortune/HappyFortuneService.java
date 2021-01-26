package com.local.spring.springdemo.fortune;

import com.local.spring.springdemo.services.FortuneService;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Oh, you luck one!";
	}

}
