import java.io.*;
import java.util.*;
public class Rectangle {
	int area;
	
Rectangle(int l,int b){
	area=l*b;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		System.out.println("Area of Rectangle1:"+r1.area);
		System.out.println("Area of Rectangle2:"+r2.area);

	}

}
