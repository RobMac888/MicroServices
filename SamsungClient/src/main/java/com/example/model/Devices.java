package com.example.model;

import java.util.List;

public class Devices {
	public String brandName="Samsung";
	public List<Device> samsungList;
	public Devices(String brandName, List<Device> samsungList) {
		super();
		this.brandName = brandName;
		this.samsungList = samsungList;
	}
	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Device> getSamsungList() {
		return samsungList;
	}
	public void setSamsungList(List<Device> samsungList) {
		this.samsungList = samsungList;
	}
	@Override
	public String toString() {
		return "Devices [brandName=" + brandName + ", samsungList=" + samsungList + "]";
	}//number of devices,Note,Galaxy
}