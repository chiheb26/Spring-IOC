package com.global;

public class Address {
	
	private Long id;
	private String City;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", City=" + City + "]";
	}
	
}
