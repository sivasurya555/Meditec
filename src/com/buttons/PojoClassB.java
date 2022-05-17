package com.buttons;

public class PojoClassB extends PojoClassA {

	public static void main(String[] args) {
		
		PojoClassA PojoClassA = new PojoClassA();
		PojoClassA.setPrice(1000);
		PojoClassA.setAmount(2000);
		PojoClassA.setCost(3000);
		
		System.out.println(PojoClassA.getPrice());
		System.out.println(PojoClassA.getAmount());
		System.out.println(PojoClassA.getCost());
		
		
		
		
		

	}

}
