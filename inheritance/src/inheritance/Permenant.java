package inheritance;

public class Permenant extends Employee {

	float fixed;
	float bonus;
	float sal;

	public Permenant(String name, int id, float fixed, float bonus) {
		super(name, id);
		this.fixed = fixed;
		this.bonus = bonus;
		this.sal = sal;
	}

	public void calsal() {
		sal = fixed + bonus;
		System.out.println("fixed salary=" + fixed);
		System.out.println("bonus=" + bonus);
		System.out.println("permenant emp salary=" + sal);
	}
}
