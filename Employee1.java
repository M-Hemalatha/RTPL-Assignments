import java.io.*;
import java.util.*;
public class Employee1 {
	int s;
	int h;
	
public void getInfo(){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter salary:");
	int sal = sc.nextInt();
	System.out.print("no of hours:");
	int hour = sc.nextInt();
	s=sal;
	h=hour;
	
}
void AddSal() {
	
	if(s<500) {
		s = s +10;
		System.out.println("Salary :"+s);
	}
	
}
void AddWork() {
	if(h>6) {
		s = s+5;
		System.out.println("Salary :"+s);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		
		emp.getInfo();
		emp.AddSal();
		emp.AddWork();
	}

}
