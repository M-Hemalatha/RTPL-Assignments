import java.io.*;
import java.util.*;
public class Average {
	int avg;
	int a;
	int b;
	int c;
	void avg() {
		Scanner s = new Scanner(System.in);
		System.out.print("enter fst num:");
		int a = s.nextInt();
		System.out.print("enter sec num:");
		int b = s.nextInt();
		System.out.print("enter trd num:");
		int c = s.nextInt();
		avg = (a+b+c)/3;
		System.out.println("Average :"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average average = new Average();
		average.avg();

	}

}
