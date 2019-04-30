package inheritance;

public class Vehicle {
	String name;
	String color;
	float speed;
	
	public Vehicle() {
		
	}



	public Vehicle(String name, String color, float speed) {
	this.name = name;
	this.color = color;
	this.speed = speed;
}
	public void print(){
		 
		 
		System.out.println(name); 
		System.out.println(color);
		System.out.println(speed);
		 
		 
	 }
	 

}
