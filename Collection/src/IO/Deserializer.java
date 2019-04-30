package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\temp\\brave.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("Reading Employee Object");
		Employee emp = (Employee) ois.readObject();
		emp.print();

	}

}