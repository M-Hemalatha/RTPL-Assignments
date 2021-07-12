import java.util.*;
import java.io.*;
public class Triangle {
	
	int area;
	int primeter;
Triangle(){
	int s1=3;
	int s2=4;
	int s3=5;
	area=(s2*s3)/2;
	primeter=s1+s2+s3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		
		System.out.println("Area of Triangle:"+t.area);
		System.out.println("Primeter of Triangle:"+t.primeter);

	}

}
