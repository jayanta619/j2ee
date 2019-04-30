
public class Main {

	public static void main(String[] args) {
		Tester t= new Tester();
		Java j=new Java();
		Meeting<Java> me= new Meeting<Java>(new Java());
		Meeting<Tester> me1= new Meeting<Tester>(new Tester());
		me.printmeeting();
		me.printReportJava(me);
		me.printReportTester(me1);
	}

}
