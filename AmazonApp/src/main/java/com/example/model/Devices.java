package com.example.model;

import java.util.List;

public class Devices {
	public String brandName;//Samsung
	public List<Devices> devices;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Devices> getDevices() {
		return devices;
	}
	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}
	public Devices(String brandName, List<Devices> devices) {
		super();
		this.brandName = brandName;
		this.devices = devices;
	}
	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Devices [brandName=" + brandName + ", devices=" + devices + "]";
	}
	
}	
	
	
	
	
	
	
	/*public Devices(String brandName, List<Devices> devices) {
		super();
		this.brandName = brandName;
		this.devices = devices;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Devices> getDevices() {
		return devices;
	}
	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}
	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}

}
*/