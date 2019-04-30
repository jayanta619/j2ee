package lab2;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student s = new Student();

		System.out.println("Enter id,name");
		s.setId(scan.nextInt());
		s.setName(scan.next());

		System.out.println("Enter per ");
		ReportCard r = new ReportCard(scan.nextFloat());
      s.setReportCard(r);
      s.print();
	}

}
