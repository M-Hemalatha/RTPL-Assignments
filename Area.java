import java.io.*;
import java.util.*;
public class Area {
	int l;
	int b;

	void setDim(int x,int y) {
		
		System.out.println(x);
		System.out.println(y);
		l=x;
		b=y;
		
	}
	public int getArea() {
		
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello..");
		Scanner scan = new Scanner(System.in);
		System.out.print("enter length :");
		int l = scan.nextInt();
		
		System.out.print("enter breadth :");
		int b = scan.nextInt();
		Area a = new Area();
		a.setDim(l,b);
		System.out.println("Area:"+a.getArea());
		}
	}
