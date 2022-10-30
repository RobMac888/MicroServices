package com.example.model;//Single Device

public class Device {
	public String name;//What - mobile phone
	public String type;//touch screen/smartphone
	public Device(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Device() {
		super();	
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", type=" + type + "]";
	}
	

		
	}
	