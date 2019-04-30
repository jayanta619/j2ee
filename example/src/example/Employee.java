package example;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	}


