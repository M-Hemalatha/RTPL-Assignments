import java.io.*;
import java.util.*;
class Distance{
	double feet,inch;
	void getDis() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter feet:");
		feet = in.nextDouble();
		System.out.print("enter inches:");
		inch=in.nextDouble();
	}
	void addDis (Distance d1,Distance d2) {
		double SumofFeet=d1.feet+d2.feet;
		double SumofInches=d1.inch+d2.inch;
		System.out.println("sum of feet :"+SumofFeet);
		System.out.println("Sum of inches:"+SumofInches);
	}
}
public class AddDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDistance ad = new AddDistance();
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		System.out.println("enter fst distance");
		d1.getDis();
		System.out.println("enter sec distance");
		d2.getDis();
		d1.addDis(d1,d2);

	}

}
