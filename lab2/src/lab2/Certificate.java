package lab2;

public class Certificate {
	String certname;
	String university;
	String grade;

	Certificate(){
		
	}
	public Certificate(String certname, String university, String grade) {
		
		this.certname = certname;
		this.university = university;
		this.grade = grade;
	}

	public String getCertname() {
		return certname;
	}

	public void setCertname(String certname) {
		this.certname = certname;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void printcert() {
		System.out.println(certname);
		System.out.println(university);
		System.out.println(grade);

	}

}
