package lab2;

public class Student {

	private int id;
	private String name;

	ReportCard reportCard;

	public Student() {

	}

	public Student(int id, String name, ReportCard reportCard) {
		this.id = id;
		this.name = name;
		this.reportCard = reportCard;

	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
reportCard.CalculateGrade();
		reportCard.GradePrint();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

}
