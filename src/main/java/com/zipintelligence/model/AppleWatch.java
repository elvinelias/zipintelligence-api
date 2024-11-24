package com.zipintelligence.model;

public class AppleWatch {

	private String color;
	private String model;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean connect() {
		System.out.println("AppleWatch: I received the connection");
		return true;
	}
}
