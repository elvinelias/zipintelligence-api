package com.zipintelligence.model;

public class Phone {

	private String color;
	private String shape;
	private String model; 

	public String getColor() {
		return this.color;
	}
	
	public void setColor (String colorinput) {
		this.color = colorinput;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public void setShape (String shapeinput) {
			this.shape = shapeinput;
	
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public boolean makeConnection() {
		AppleWatch myapplewatch = new AppleWatch();
		boolean isconnected = myapplewatch.connect();
		System.out.println("Phone: I am in Phone class, Is it connected?" + isconnected);
		return isconnected;
		
	}
	
}
