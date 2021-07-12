
public class Student {
	String name;
	int rollno;
	long phnno;
	String address;
	void print() {
		System.out.println("Details of "+name);
		System.out.println("Roll No :"+rollno);
		System.out.println("Phone No :"+phnno);
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name="John";
		stu1.rollno=2;
		stu1.phnno=8745314672L;
		stu1.address="America";
		
		stu2.name="Sam";
		stu2.rollno=3;
		stu2.phnno=8745373236L;
		stu2.address="Africa";
		
		stu1.print();
		stu2.print();

	}

}
