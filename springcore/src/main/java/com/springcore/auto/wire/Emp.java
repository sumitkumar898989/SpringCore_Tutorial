package com.springcore.auto.wire;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setAddress in Emp class");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

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
