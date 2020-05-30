package com.home.Streams;

import java.util.HashSet;
import java.util.Set;

public class Employees {
	
	private String empName;
	private Set<String> devices;
	
	public void addDevices(String device) {
		if(devices == null)
			this.devices = new HashSet<String>();
		devices.add(device);
	}
	
	/*
	 * public Employees(String empName, Set<String> devices) { this.empName =
	 * empName; this.devices = devices; }
	 */
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Set<String> getDevices() {
		return devices;
	}
	
	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	
	

}
