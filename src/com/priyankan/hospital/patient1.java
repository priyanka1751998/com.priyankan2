package com.priyankan.hospital;

public class patient1 extends opd {
	
	public patient1(int id) {
		super(id);
	}
	
	public void appointment() {
		System.out.println("patient1 takes appointment");
	}
	
	public void treatment() {
		System.out.println("patient1 takes treatment");
	}
	public void medicine() {
		System.out.println("patient1 takes medicine");
	}
}