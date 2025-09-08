package pakage1;
public class MethodOverloading {
	    
	static void add(int a, int b) //-------------static method
	{
		int c= a+b;
		System.out.println(c);
	}
	static void add(int a, int b, int c) //-------------static method
	{
		int d= a+b+c;
		System.out.println(d);
	}
	MethodOverloading(int a, int b) //---------------Constructor
	{
		int d= a+b;
		System.out.println(d);
	}
	
	MethodOverloading(int a, int b,int c) //---------------Constructor
	{
		int d= a+b+c;
		System.out.println(d);
	}
    void add(int a)//-------------non static method
	{
		System.out.println(a);	
	}
	void add(int a, double b, int c,int d)//-------------non static method
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(12,23);
		add(20,20,40);
		MethodOverloading a1= new MethodOverloading(200, 500);
		new MethodOverloading(10,20,50);
		a1.add(20);
		a1.add(4, 500, 80,50);
     }
     }
