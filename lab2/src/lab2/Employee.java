package lab2;

public class Employee {

	private int id;
	private String name;
	private float salary;

	private Address address;
	private Certificate c;

	public Employee() {

	}

	public Employee(int id, String name, float salary, Address address,Certificate c) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.c=c;
	}

	public Certificate getC() {
		return c;
	}

	public void setC(Certificate c) {
		this.c = c;
	}

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printEmployee() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
		address.printAddress();
		c.printcert();
	}


}
