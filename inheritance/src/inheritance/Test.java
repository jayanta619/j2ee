 package inheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of vehicle");

		int n = scan.nextInt();
		Vehicle[] v = new Vehicle[n];
		for (int i = 0; i < v.length; i++) {

			System.out.println("choose one 1.car 2.bike");
			int x = scan.nextInt();
			System.out.println("enter name of vehicle");
			String name = scan.next();
			System.out.println("enter color of vehicle");
			String color = scan.next();
			System.out.println("enter speed of vehicle");
			float speed = scan.nextFloat();

			switch (x) {
			case 1:
				System.out.println("enter gear type");
				int geartype = scan.nextInt();
				v[i] = new Car(name, color, speed, geartype);
				break;

			case 2:
				System.out.println("enter stroke type");
				float stroketype = scan.nextFloat();
				v[i] = new bike(name, color, speed, stroketype);
				break;

			}

		}
	
	}

}
