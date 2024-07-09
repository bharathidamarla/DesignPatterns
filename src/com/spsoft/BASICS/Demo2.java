package com.spsoft.BASICS;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	int id;
	String name;
	String designation;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class Employee {
	public static void main(String[] args) {

		List<Demo2> list = new ArrayList<>();

		Demo2 variable = new Demo2();
		Demo2 variable1 = new Demo2();
		Demo2 variable2 = new Demo2();
		Demo2 variable3 = new Demo2();

		variable.setId(101);
		variable.setName("bharathi");
		variable.setDesignation("tester");
		variable.setSalary(20000);
		list.add(variable);

		variable1.setId(102);
		variable1.setName("cheshmaa");
		variable1.setDesignation("tester");
		variable1.setSalary(15000);
		list.add(variable1);

		variable2.setId(103);
		variable2.setName("anitha");
		variable2.setDesignation("tester");
		variable2.setSalary(10000);
		list.add(variable2);

		variable3.setId(104);
		variable3.setName("bhanu");
		variable3.setDesignation("tester");
		variable3.setSalary(40000);
		list.add(variable3);

		Integer integer = list.stream().filter(s -> s.getDesignation().equals("Associate Engineer"))
				.map(Demo2::getSalary).max(Integer::compare).get();
		System.out.println(integer);
	}
}