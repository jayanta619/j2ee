package inheritance;

public class Empsalary {

	public static void main(String[] args) {
		Permenant p = new Permenant("manager", 101, 15000, 2400);
		Consultant c = new Consultant("trainer", 10, 1200, 5000);
		p.print();

		p.calsal();

		c.calsal();
		c.print();
	}

}
