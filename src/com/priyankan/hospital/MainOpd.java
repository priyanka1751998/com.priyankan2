package com.priyankan.hospital;


public class MainOpd {

	public static void main(String args[]) {
		
		
		patient1 obj = new patient1(10);
		obj.appointment();
		obj.treatment();
		obj.medicine();

		patient1 p = new patient1(1);
		System.out.println(p.equals(obj));    
		
	}

}