package inheritance;

public class Car extends Vehicle{
	int gear=2;
	public Car() {
		
	}
	public Car(String name, String color, float speed,int gear) {
		super(name,color,speed);
		this.gear=gear;
		
	}
	
	public void print() {
		super.print();
	}

	public void acceleration() {
		gear+=5;
		System.out.println("stroke increased by="+gear);
	}
}


