package inheritance;

public class bike extends Vehicle {
	float stroke=2;
	public bike() {
		
	}
	public bike(String name, String color, float speed,float stroke) {
		super(name,color,speed);
		this.stroke=stroke;
		
	}
	
	public void print() {
		super.print();
	}

	public void acceleration() {
		stroke+=2;
		System.out.println("stroke increased by="+stroke);
	}
}
