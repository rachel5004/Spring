package com.sist.main3;

import org.springframework.stereotype.Component;

@Component
public class MySql implements DB{
	@Override
	public void select() {
		System.out.println("mysql:select");
	}

	@Override
	public void insert() {
		System.out.println("mysql:insert");
	}

	@Override
	public void delete() {
		System.out.println("mysql:delete");		
	}

	@Override
	public void update() {
		System.out.println("mysql:update");		
	}
}
