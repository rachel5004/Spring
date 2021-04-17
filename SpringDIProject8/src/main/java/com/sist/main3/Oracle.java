package com.sist.main3;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements DB{
	@Override
	public void select() {
		System.out.println("oracle:select");
	}

	@Override
	public void insert() {
		System.out.println("oracle:insert");
	}

	@Override
	public void delete() {
		System.out.println("oracle:delete");		
	}

	@Override
	public void update() {
		System.out.println("oracle:update");		
	}

}
