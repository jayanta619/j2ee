package lab2;

public class ReportCard {
	float per;
	String grade;

	public ReportCard() {
	}

	public ReportCard(float per) {

		this.per = per;
	

	}

	void CalculateGrade() {
		if (per > 30 && per < 50)
			grade="3rd class";
		else if (per > 50 && per < 60)
		grade="2nd class";
		else if (per > 60 && per < 70)
	     grade="1st class";
		else if (per > 70 && per < 100)
	    grade="distinction";
		else
		grade="fail";
	}
	public void GradePrint() {
		
		System.out.println(grade);
		
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	

}
