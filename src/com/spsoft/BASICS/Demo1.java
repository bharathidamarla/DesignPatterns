package com.spsoft.BASICS;

class Example {
	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class Demo1 {

	public static void main(String[] args) {

		Example example = new Example();

		example.setId(101);
		int id = example.getId();

		example.setName("Bharathi");
		String name = example.getName();

		System.out.println(id + "  " + name);

	}

}