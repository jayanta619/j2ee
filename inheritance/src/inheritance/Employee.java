package inheritance;

public class Employee {
	String name;
	int id;

	void employee() {

	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public void print() {
		System.out.println(name);
		System.out.println(id);

	}

	public void calsal() {
		System.out.println("salary");
	}
}
