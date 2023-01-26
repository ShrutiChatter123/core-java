package com.xworkz.tuesday.polymorphism;

public class Person {
	
	public static void buy(int money) {
		System.out.println("int mobile money:"+money);
	}
 public static void buy(String food, int quantity) {
	System.out.println("String food: " + food +" "+ "quantity in kg: " + quantity);
}
public static void buy(String dress,String shoes,float belt) {
	System.out.println("buying dress " +dress+"&buying shoes"+shoes+"buying belt" +belt);
}
public static void buy(String bag,String watch) {
	System.out.println("buying bag" +bag+"&buying watch"+watch);
}

}
 