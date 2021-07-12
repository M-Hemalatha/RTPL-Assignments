
public class Triangle2 {
	int area;
	int primeter;
Triangle2(int a,int b,int c){
	area=(a*b)/2;
	primeter=a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle2 t = new Triangle2(3,4,5);
		
		System.out.println("Area of Triangle:"+t.area);
		System.out.println("Primeter of Triangle:"+t.primeter);

	}

}
