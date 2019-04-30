package example;

public class Student {

	int id;
	String name;
	float[] marks=new float[5];
	float avg;
	float per;
	public Student() {}
	public Student(int id, String name, float [] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	void print() {
		System.out.println(id);
		System.out.println(name);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			avg=avg+marks[i];
			
		}
		per=avg/5;
		System.out.println("percentage="+per);
	}
}
