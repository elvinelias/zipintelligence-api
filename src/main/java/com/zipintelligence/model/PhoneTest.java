package com.zipintelligence.model;

public class PhoneTest {
	public static void main(String[] args) {

		Phone myphone = new Phone();
		myphone.setColor("PhoneTest: Yellow");
		myphone.setModel("PhoneTest:IPhone 12 Mini");
		
		System.out.println("PhoneTest: My phone color is:" + myphone.getColor());
		System.out.println(myphone.getModel());
		System.out.println("PhoneTest: I am connecting from my phone to applewatch: Is it connected?" + myphone.makeConnection());
	
		/*
		Phone snigdhaphone = new Phone();
		snigdhaphone.setColor("Blue");
		snigdhaphone.setModel("IPHONE 8");
		
		
		System.out.println("Snigdha's phone color is:" + snigdhaphone.getColor());
		System.out.println(snigdhaphone.getModel());
		
		Phone vishphone = new Phone();
		vishphone.setColor("Purple");
		vishphone.setModel("IPhone 7 Plus");
		
		System.out.println("Vish'sphone color is:" + vishphone.getColor());
		System.out.println(vishphone.getModel());
		*/
	}
}
