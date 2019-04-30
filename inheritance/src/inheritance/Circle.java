package inheritance;

public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", name=" + name + ", area=" + area + ",getClass()="
				+ getClass().getSimpleName() + ", hashCode()=" + hashCode() + "]";
	}

	public boolean equals(Object obj) {
		return (obj instanceof Circle && this.name == ((Circle) obj).name) ? true : false;

	}

	@Override
	public void printShape() {
		System.out.println("Radius= " + radius);
		super.printShape();
	}

}
