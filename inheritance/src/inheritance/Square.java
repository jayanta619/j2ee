package inheritance;

public class Square extends Shape {

	float side;

	public Square() {

	}

	public Square(String name, float side) {
		super(name);
		this.side = side;
	}

	@Override
	public void findArea() {
		area = side*side;
	}

	@Override
	public void printShape() {
		System.out.println("side= " + side);
		super.printShape();
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", name=" + name + ", area=" + area + "]";
	}


}
