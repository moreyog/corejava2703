package com.test;

public class CustomerTest {

	public static void main(String[] args) {
		Pizza favPizza = new Pizza();
		System.out.println("Meat on pizza before bake : " + favPizza.meat);
		bake(favPizza);
		System.out.println("Meat on pizza after bake : " + favPizza.meat);
	}
	
	public static void bake(Pizza pizzaToBeBaked) {
		pizzaToBeBaked.meat = "chicken";
		pizzaToBeBaked = null;
	}
}
