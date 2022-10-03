package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired   //1st way
	@Qualifier("temp2")
	private Address address;

	public Address getAddress() {
		return address;
	}
    //@Autowired    //2nd way
	public void setAddress(Address address) {
		System.out.println("inside setAddress in Emp class");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
    //@Autowired   //3rd way
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside parametrized constructor in Emp class");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
