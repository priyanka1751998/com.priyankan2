package com.priyankan.hospital;

public class patient2 extends opd {
	
	public patient2(int id) {
		super(id);
	}
	
	public void appointment() {
		System.out.println("patient2 takes appointment");
	}
	
	public void treatment() {
		System.out.println("patient2 takes treatment");
	}
	
}