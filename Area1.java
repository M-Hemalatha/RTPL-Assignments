import java.util.Scanner;
public class Area1 {
	int l;
	int b;
Area1(int x,int y){
	l=x;
	b=y;
}
public int returnArea() {
	return l*b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter length:");
		int l = s.nextInt();
		System.out.println("enter breadth:");
		int b = s.nextInt();
		Area1 a = new Area1(l,b);
		System.out.println("Area of rectangle:"+a.returnArea());

	}

}
