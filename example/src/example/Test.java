package example;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		float[] marks=new float[5];
		System.out.println("enter size of array");
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		int [] num=new int[n]; 
		System.out.println("enter the id");
		int id= scan.nextInt();
		System.out.println("enter the name");
		String name=scan.next();
		System.out.println("enter the marks");
	for (int i = 0; i < marks.length; i++) {
		 marks[i]=scan.nextFloat();
		
	}
		Student e=new Student(id,name, marks);
		e.print();
	}

}
