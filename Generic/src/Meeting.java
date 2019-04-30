
public class Meeting <m extends Employee>{
private m head;

public Meeting(m head) {
	super();
	this.head = head;
}


public m getHead() {
	return head;
}

public void setHead(m head) {
	this.head = head;
}
public void printmeeting() {
	System.out.println("head is="+ head.getClass().getSimpleName());
}
public void printReport(Meeting<?> me){
	System.out.println("Printing Report for meeting0"
			+ "");
	me.printmeeting();
}

public void printReportTester(Meeting<? extends Tester> me){
	System.out.println("tester head the meeting");
	me.printmeeting();
}

public void printReportJava(Meeting<? super Java> me){
	System.out.println("java head the meeting");
	me.printmeeting();
}












}
