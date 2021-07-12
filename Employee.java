import java.io.*;
import java.util.*;
public class Employee {
	private String name, address;
	  private int year, salary;
	  public Employee(String n, int y, int sal, String add){
		    name = n;
		    year = y;
		    salary = sal;
		    address = add;
		  }  
	  public String getName(){
		    return name;
		  }
		  public int getYear(){
		    return year;
		  }
		  public int getSalary(){
		    return salary;
		  }
		  public String getAddress(){
		    return address;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
		Employee emp2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
		Employee emp3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
		  
		    System.out.println("Name\tYear of joining\t\tSalary\tAddress");
		    System.out.println(emp1.getName()+"\t"+emp1.getYear()+"\t\t\t"+emp1.getSalary()+"\t"+emp1.getAddress());  
		    System.out.println(emp2.getName()+"\t"+emp2.getYear()+"\t\t\t"+emp2.getSalary()+"\t"+emp2.getAddress());  
		    System.out.println(emp3.getName()+"\t"+emp3.getYear()+"\t\t\t"+emp3.getSalary()+"\t"+emp3.getAddress());  
       
	}

}
