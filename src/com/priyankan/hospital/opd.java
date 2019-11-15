package com.priyankan.hospital;

public abstract class opd {
	//state
	public final int id;
	
	public opd(int id) {
		this.id=id;
	}
	
	
	//behaviour
	public abstract void appointment();
	
	//this is abstract method
	
	public void treatment()
	{
		System.out.println("Take treatment...");
	}
	
	public void medicine()
	{
		System.out.println("Take medicine...");
	}
	
	public boolean equals(Object obj) {
		opd a = (opd)obj;
		return a.id == this.id;
	}
}