
public class Addition {
	int a;
	int b;
	public int add(){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world...");
		Addition add = new Addition();
		Addition add1 = new Addition();
		Addition add2 = new Addition();
		add.a=10;
		add.b=20;
        add1.a=15;
        add1.b=110;
        add2.a=65;
        add2.b=11;
        
        System.out.println(add.add());
        System.out.println(add1.add());
        System.out.println(add2.add());
	}
}
