package com.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private Long id;
	private String name;
	private Double salary;
	private Department department1;
	private Department department2;

	public Department getDepartment2() {
		return department2;
	}
	
	@Autowired
	@Qualifier("dept2")
	public void setDepartment2(Department department2) {
		this.department2 = department2;
	}


	List<String> speciality;
	List<Address> address;
	
	
	public Employee() {
		
	}
	
	public void init() {
		
		System.out.println("In Employee init method !");
	}
	
	public void cleanUp() {
		
		System.out.println("In Employee destroy method !");
	}
	
	public Employee(Long id, String name, Double salary, Department department, List<String> speciality,
			List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department1 = department;
		this.speciality = speciality;
		this.address = address;
	}


	public void printName() {
		System.out.println("Employee name is >> " + name + " and salary is >> " + salary + "\n\nDepartment 1 is >> " + department1.getName()+ "\n\nDepartment 2 is >> " + department2.getName());
		System.out.println("\nSpecialities are :");
		for(String spec : speciality) {
			System.out.println("  >> " + spec);
		}
		System.out.println();
		System.out.println("Addresses are : ");
		for(Address add : address) {
			System.out.println("  >> " + add);
		}
	}
	
	
	public Department getDepartment1() {
		return department1;
	}
	
	@Autowired
	@Qualifier("dept1")
	public void setDepartment1(Department department) {
		System.out.println("setting");
		this.department1 = department;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public List<String> getSpeciality() {
		return speciality;
	}


	public void setSpeciality(List<String> speciality) {
		this.speciality = speciality;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	
}
