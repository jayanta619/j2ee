package inheritance;

public class Testshape {

	public static void main(String[] args) {

		Shape c = new Circle("square", 2f);
		Shape s = new Circle("circle", 2f);

		c.findArea();
		s.findArea();
		System.out.println(c);
		System.out.println(s);
		System.out.println(c.equals(s));
	}

}
