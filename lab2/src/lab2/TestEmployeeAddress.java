package lab2;
import java.util.Scanner;

public class TestEmployeeAddress {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Address a = new Address();
		Certificate c= new Certificate();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id,name and salary");
		e.setId(scan.nextInt()) ;
		e.setName(scan.next());
		e.setSalary(scan.nextFloat());
		
		System.out.println("Enter city, state and pincode");
		a.setCity(scan.next());
		a.setState(scan.next());
		a.setPincode(scan.next());
		 
		System.out.println("Enter address line");
		scan.nextLine();
		a.setLine(scan.nextLine());
		System.out.println("enter name ,university,grade");
		c.setCertname(scan.next());
		c.setUniversity(scan.next());
		c.setGrade(scan.next());
		
		e.setAddress(a);
		e.setC(c);
		e.printEmployee();
	}

}