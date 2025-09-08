package pakage1;

 class Class1
 {
	  
	 Class1()
	 {
		 System.out.println("Class1 constructor"); 
	 }
	
}
 
 class Class2 extends Class1
 {
	
	Class2()
	 {
		 System.out.println("Class2 constructor");
	 }
	 
 }
public class SuperCalling_Statement extends Class2
{ 
	
	SuperCalling_Statement()
	
	{
	  // super(2);
		System.out.println("SuperCalling_Statement constructor 2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCalling_Statement sc=new SuperCalling_Statement();

	}

}
