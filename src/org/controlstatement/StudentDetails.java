package org.controlstatement;

public class StudentDetails {
public StudentDetails() {
	System.out.println("non para cons");
}
public StudentDetails(int age) {
	System.out.println("am para cons");
}
private void StudentDetails() {
	System.out.println("am metod");

}
public static void main(String[] args) {
	StudentDetails a = new StudentDetails();
			//a.StudentDetails();
	a.StudentDetails();
	
}
}
