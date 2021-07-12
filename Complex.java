import java.io.*;
import java.util.*;
public class Complex {
	
	static int sum(int a,int b) {
		return a+b;
	}
	static int dif(int x,int y) {
		return x-y;
	}
	static int pro(int o,int p) {
		return o*p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.print("enter real part:");
		int i = c.nextInt();
		System.out.print("enter imaginary part:");
		int j = c.nextInt();
		System.out.println("Sum :"+sum(i,j));
		System.out.println("Difference :"+dif(i,j));
		System.out.println("Product :"+pro(i,j));

	}

}
