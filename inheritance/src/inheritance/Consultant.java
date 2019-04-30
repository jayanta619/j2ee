package inheritance;

public class Consultant extends Employee {

	float incentive;
	float perdaysal;
	float sal;

	public Consultant(String name, int id, float incentive, float perdaysal) {
		super(name, id);
		this.incentive = incentive;
		this.perdaysal = perdaysal;
		this.sal = sal;
	}

	public void calsal() {
		sal = 22 * perdaysal + incentive;
		System.out.println("incentive=" + incentive);
		System.out.println("perdaysal=" + perdaysal);
		System.out.println("consultant salary=" + sal);
	}

}
